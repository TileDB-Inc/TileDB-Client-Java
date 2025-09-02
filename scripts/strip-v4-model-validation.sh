#!/usr/bin/env bash

set -euo pipefail

ROOT_DIR="$(cd "$(dirname "$0")"/.. && pwd)"
V4_MODELS_DIR="$ROOT_DIR/src/main/java/io/tiledb/cloud/rest_api/v4/model"

if [ ! -d "$V4_MODELS_DIR" ]; then
  echo "v4 models directory not found: $V4_MODELS_DIR" >&2
  exit 0
fi

shopt -s nullglob
for file in "$V4_MODELS_DIR"/*.java; do
  tmp="${file}.tmp"
  awk '
    BEGIN { in_method=0; brace=0; indent="" }
    {
      line=$0
      if (in_method==0 && line ~ /public[[:space:]]+static[[:space:]]+void[[:space:]]+validateJsonObject[[:space:]]*\(JsonObject[[:space:]]+jsonObj\)[[:space:]]*throws[[:space:]]+IOException[[:space:]]*\{/ ) {
        match(line, /^[[:space:]]*/)
        indent=substr(line, RSTART, RLENGTH)
        print line
        print indent"}"
        in_method=1
        brace=1
        next
      }
      if (in_method==1) {
        open_n = gsub(/\{/, "{", line)
        close_n = gsub(/\}/, "}", line)
        brace += open_n
        brace -= close_n
        if (brace<=0) {
          in_method=0
        }
        next
      }
      if (line ~ /validateJsonObject\(jsonObj\);/) { next }
      print line
    }
  ' "$file" > "$tmp"
  mv "$tmp" "$file"

done

exit 0

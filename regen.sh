#!/usr/bin/env bash

set -ex

# Regenerate client code
openapi-generator-cli generate -i openapi-v1.yaml -g java -c config.yaml

# Add all src files
git add src/{main,test}/java
# Add any other existing Git-tracked files (e.g. `.openapi-generator/FILES`)
git add -u .
# openapi-generator-cli tries to bump our Gradle version
git checkout HEAD -- gradle/wrapper/gradle-wrapper.properties

# Apply custom code / patches
git cherry-pick -n patch

# Commit changes
if git diff --quiet HEAD; then
  echo "Nothing to commit"
else
  git commit -m '`regen.sh`'
fi

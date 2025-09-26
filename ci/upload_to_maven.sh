#!/usr/bin/env bash

set -e

export GPG_KEY_LOCATION="$(pwd)/encrypted.key"
echo "Starting upload to maven"
echo "$GPG_SECRET_KEYS_ENC" | base64 --decode > "$GPG_KEY_LOCATION"
export PROJECT_VERSION="$(./gradlew properties -q | grep "^version: " | awk '{print $2}')"
echo "\$PROJECT_VERSION: $PROJECT_VERSION" >&2
# Upload only snapshots to Sonatype OSS so it can make its way to Maven Central
# https://ossrh-staging-api.central.sonatype.com/content/repositories/snapshots/io/tiledb/tiledb-cloud-java/
./gradlew publishMavenJavaPublicationToMavenRepository

# Only non-snapshot can be pushed as Maven releases
if ! echo "$PROJECT_VERSION" | grep -q "SNAPSHOT"; then
    tag="$(git tag --points-at HEAD)"
    if [ -z "$tag" ]; then
        echo "Error: expected tag $PROJECT_VERSION" >&2
        exit 1
    elif [ "$tag" != "$PROJECT_VERSION" ]; then
        echo "Error: tag $tag != version $PROJECT_VERSION" >&2
        exit 1
    fi
    ./gradlew closeAndReleaseRepository
fi

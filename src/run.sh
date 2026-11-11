#!/bin/bash

cd "$(dirname "$0")/.."

rm -rf out
mkdir -p out

javac -d out $(find src -name "*.java") || exit 1

java -cp out Main
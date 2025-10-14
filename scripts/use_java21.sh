#!/usr/bin/env bash
# Script para compilar y ejecutar el proyecto con un JDK 21 preinstalado.
# Uso:
#   export JAVA_HOME=/path/to/jdk-21
#   export PATH="$JAVA_HOME/bin:$PATH"
#   ./scripts/use_java21.sh

set -euo pipefail
ROOT="$(cd "$(dirname "$0")/.." && pwd)"
SRC_DIR="$ROOT/CLASES"
OUT_DIR="$ROOT/out"

mkdir -p "$OUT_DIR"

echo "Usando JAVA_HOME=${JAVA_HOME:-<no-set>}"
java -version || true
javac -version || true

# Compilar todos .java en CLASES
find "$SRC_DIR" -name "*.java" > /tmp/java_sources.txt
javac -d "$OUT_DIR" @/tmp/java_sources.txt

echo "Compilación completada. Ejecutando Principal..."
java -cp "$OUT_DIR" Principal

#!/usr/bin/env bash
# Script simple para descargar e instalar un JDK 21 en el directorio .jdk del repo.
# Nota: requiere curl/tar y acceso a internet.

set -euo pipefail
ROOT="$(cd "$(dirname "$0")/.." && pwd)"
LOCAL_JDK_DIR="$ROOT/.jdk"

if [ -d "$LOCAL_JDK_DIR" ]; then
  echo ".jdk ya existe en el repo: $LOCAL_JDK_DIR"
  java -version || true
  exit 0
fi

echo "Descargando Temurin JDK 21 (Linux x64) a .jdk ..."
TMPDIR=$(mktemp -d)
cd "$TMPDIR"

# URL known for Temurin; if blocked, instruct the user to provide a JDK manually.
URL="https://github.com/adoptium/temurin21-binaries/releases/latest/download/OpenJDK21U-jdk_x64_linux_hotspot.tar.gz"

if command -v curl >/dev/null 2>&1; then
  echo "Usando curl para descargar: $URL"
  if curl -fSL "$URL" -o jdk21.tar.gz; then
    mkdir -p "$LOCAL_JDK_DIR"
    tar -xzf jdk21.tar.gz --strip-components=1 -C "$LOCAL_JDK_DIR"
    echo "JDK 21 instalado en $LOCAL_JDK_DIR"
    ls -l "$LOCAL_JDK_DIR/bin/java" || true
    cd "$ROOT"
    java -version || true
    exit 0
  else
    echo "Falló la descarga automática. Revisa la conexión o descarga manualmente:" >&2
    echo "$URL" >&2
    exit 2
  fi
else
  echo "curl no está instalado. Instala curl o descarga un JDK 21 manualmente y descomprímelo en .jdk" >&2
  exit 3
fi

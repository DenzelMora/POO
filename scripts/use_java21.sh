#!/usr/bin/env bash
# Script para compilar y ejecutar el proyecto con un JDK 21.
# Comportamiento:
#  - Si $JAVA_HOME está exportado, lo utiliza.
#  - Si existe el directorio .jdk en la raíz del repo, lo usa como JAVA_HOME.
#  - Si no hay JDK detectado, muestra instrucciones y propone ejecutar
#    scripts/setup_jdk21.sh para instalar/descargar un JDK portable en .jdk.

set -euo pipefail
ROOT="$(cd "$(dirname "$0")/.." && pwd)"
SRC_DIR="$ROOT/CLASES"
OUT_DIR="$ROOT/out"
LOCAL_JDK_DIR="$ROOT/.jdk"

mkdir -p "$OUT_DIR"

if [ -z "${JAVA_HOME:-}" ]; then
	if [ -d "$LOCAL_JDK_DIR" ]; then
		export JAVA_HOME="$LOCAL_JDK_DIR"
		export PATH="$JAVA_HOME/bin:$PATH"
		echo "Usando JDK local en $LOCAL_JDK_DIR"
	else
		echo "JAVA_HOME no está seteado y no se encontró .jdk en el repo."
		echo "Puedes instalar/descargar un JDK 21 ejecutando: ./scripts/setup_jdk21.sh"
		echo "O exportar JAVA_HOME a un JDK 21 ya instalado, por ejemplo:"
		echo "  export JAVA_HOME=/path/to/jdk-21"
		echo "  export PATH=\"$JAVA_HOME/bin:$PATH\""
		echo
		echo "Salida sin compilar. Si quieres que el script intente instalar un JDK,"
		echo "vuelve a ejecutar: ./scripts/setup_jdk21.sh y luego este script."
		exit 1
	fi
else
	echo "Usando JAVA_HOME=${JAVA_HOME}"
fi

java -version || true
javac -version || true

# Compilar todos .java en CLASES
find "$SRC_DIR" -name "*.java" > /tmp/java_sources.txt
javac -d "$OUT_DIR" @/tmp/java_sources.txt

echo "Compilación completada. Ejecutando Principal..."
java -cp "$OUT_DIR" Principal

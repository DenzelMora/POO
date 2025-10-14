```markdown
# POO

Instrucciones rápidas para usar Java 21 en este repositorio.

- Para intentar configurar un JDK 21 local (descarga Temurin/Adoptium):
	```bash
	./scripts/setup_jdk21.sh
	```

- Una vez instalado en `.jdk`, compila y ejecuta el proyecto con:
	```bash
	./scripts/use_java21.sh
	```

- Alternativa: si ya tienes JDK 21 instalado, exporta JAVA_HOME y ejecuta:
	```bash
	export JAVA_HOME=/path/to/jdk-21
	export PATH="$JAVA_HOME/bin:$PATH"
	./scripts/use_java21.sh
	```

Nota: los scripts asumen Linux x86_64 y acceso a internet para la descarga automática.
Si tu entorno no permite descargas, instala un JDK 21 manualmente y apunta `JAVA_HOME` al mismo.
```
# POO
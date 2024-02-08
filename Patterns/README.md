# CVDS_LAB2_2024-1

## **LA HERRAMIENTA MAVEN** 

**¿Cuál es su mayor utilidad?**
  Estandarizar la construcción de proyectos en Java, facilitando su creación de un sistema uniforme y mejorando las buenas prácticas de desarrollo.
  
**Ciclo de vida de la construcción**
  Las partes principales del proyecto Maven son:
  1. **compile**: Genera los ficheros (.class) compliando el codigo en (.java).
  2. **test**: Ejecuta automaticamente los test en JUnit.
  3. **package**: Genera los ficheros (.jar) con los archivos (.class) compilados.
  4. **install**: Se realiza una copia del fichero  (.jar) a un directorio dentor del ordenador.
  5. **deploy**: Se realiza una copia del fichero (.jar) a un servidor remoto.
  
**¿Para qué sirven los plugins?**
  Maven es un framework de plugin ejecutables. Los plugins tienen unas metas donde varia su funcionamiento algunas pueden: compilar el proyecto, implementarlo en un servidor local o remoto. 
  
**¿Qué es y para qué sirve el repositorio central de maven?**
  El repositorio central es donde Maven descarga todas las bibliotecas de dependencias del proyecto en una ubicación predeterminada. La forma que lo hace es por medio de la carpeta .m2 dentro del repositorio local. 

## **CREAR UN PROYECTO CON MAVEN**

**¿Cómo se crea un proyecto maven con ayuda de los arquetipos(archetypes)?**
  Un arquetipo es una plantilla parametrizadas para desarrollar. Se realiza por medio de la siguiente estructura: 

  mvn archetype:generate

  Usando los siguientes parámetros. 
  ```
  "-DgroupId=edu.eci.cvds" "-DartifactId=Patterns" "-DarchetypeGroupId=org.apache.maven.archetypes" "-DarchetypeArtifactId=maven-archetype-quickstart" "-DarchetypeVersion=1.0" "-DinteractiveMode=false" "-Dpackage=edu.eci.cvds.patterns.archetype"
  ```

## **COMPILAR Y EJECTUAR**

**Busque cuál es el objetivo del parámetro "package" y qué otros parámetros se podrían enviar al comando mvn.**
  - **mvn package**: Comando para empaquetado del proyecto maven. Para un proyecto java se realiza en un paquete (.jar).
  - **mvn compile**: Compando para la compilación del proyecto maven. Se forman archivos (.class) y se guardan en la carpeta de clases.
  - **mvn test**: Comando para realizar los test de las pruebas unitarias del proyecto maven.

**Busque cómo ejecutar desde línea de comandos, un proyecto maven y verifique la salida cuando se ejecuta con la clase App.java como parámetro en "mainClass**
  mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.archetype.App"

## **HACER EL ESQUELETO DE LA APLICACIÓN**

**¿Cuál fábrica hiciste? y ¿Cuál es mejor?**
  - **Simple Factory**: De las 3 opciones elegí simple factory. Cada uno tiene propósitos diferentes que llegan a ser más o menos útiles dependiendo de la situcaión. En este caso simple factory esta pensado para tener una clase que se encargue de crear instancias de diferentes clases concretas basado en un parámetro de entrada, pero en algunos casos puede volverse difícil de mantener y extender más adelante.
  
**¿Cuál(es) de las anteriores instrucciones se ejecutan y funcionan correctamente y por qué?**
  - **Sin Parámetros**: No se ejecuta ya que es obligatorio tener un parámetro para que funcione.
  - **qwerty**: No funciona, por lo que es como sino hubiera párametro y sin párametro es imposible el funcionamiento.
  - **pentagon**: Con este comando si funciona correctamente ya  que es un parametro válido; sin embargo se debe tener cuidado con las mayúsculas y minúsculas ya que si en nuetro código estuviera pentagon con p mayúscula el codigo no hubiera funcionado.
  - **Hexagon**:  Con este comando si funciona correctamente ya  que es un parámetro válido, sin embargo igual que en el caso anterior se deben de tener en cuenta las mayusculas y minusculas.
## **PARA QUÉ SIRVE "GITIGNORE"**
El git ignore es un comando de git que se usa cuando queremos que un archivo específico sea ignorado porque no queremos hacerle un control de versiones, esto permite que al hacer git status no se nos muestre el archivo que queremos que ignore. El git ignore se queda como un archivo de texto en la raíz del proyecto.
#
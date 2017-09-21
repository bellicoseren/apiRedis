# redis-component
[![N|Solid](https://redis.io/images/redis-white.png)](https://redis.io)

Funciones comunes para el uso de redis

## Uso local

Compilar el proyecto 
```
mvn clean install
```

## Subir artefacto al repositorio remoto

Para que pueda ser utilizado como una dependencia, es necesario instalar el proyecto en el repositorio remoto realizando las siguientes acciones:

1.- Configurar el settings.xml de maven

```xml
    <server>
      <id>nexus-repository</id>
      <username>middleware</username>
      <password>m1dll3w4r3</password>
    </server>
```
2.- Empaquetar el proyecto

```
mvn clean package
```

3.- Subir el artefacto al repositorio remoto

```sh
mvn deploy:deploy-file -DgroupId=mx.com.beo \
  -DartifactId=redis-component \
  -Dversion=1.0 \
  -Dpackaging=jar \
  -Dfile=<ruta-jar> \
  -DrepositoryId=nexus-repository \
  -Durl=http://200.39.24.141:8081/repository/ADMiddleware/
```

## Uso como dependecia 

Para utilizar la libreria como dependencia es necesario agregar al **pom.xml** del proyecto las siguientes etiquetas:

```xml
      <dependency>
         <groupId>mx.com.beo</groupId>
         <artifactId>redis-component</artifactId>
         <version>${redis-component.version}</version>
      </dependency>
```

```xml
   <repositories>
      <repository>
        <id>nexus-repository</id>
        <url>http://200.39.24.141:8081/repository/GrupoMiddleware</url>
      </repository>
   </repositories>  
```

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
      <password>m1ddl3w4r3</password>
    </server>
```
2.- Agregar el siguiente plugin al **pom.xml**

```xml
    <distributionManagement>
    <repository>
      <id>nexus-repository</id>
      <url>http://200.39.24.141:8081/repository/ADMiddleware/</url>
    </repository>
  </distributionManagement>
```

3.- Empaquetar el proyecto

```
mvn clean deploy
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

## Variables de ambiente

Previo a la ejecucion del programa es necesario configurar las siguientes variables de ambiente:

```
 HOST_REDIS=127.0.0.1
 PUERTO_REDIS=6379
 PASSWORD_REDIS=kods12d48f1
```

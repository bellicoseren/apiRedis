# redis-component
[![N|Solid](https://redis.io/images/redis-white.png)](https://redis.io)

Funciones comunes para el uso de redis

## Uso local

Compilar el proyecto 

##### Ambiente local
```
mvn --settings settings_local.xml clean install
```
##### Ambiente de desarrollo (Red privada)

```
mvn --settings settings_dev.xml clean install
```
## Subir artefacto al repositorio remoto

Para que pueda ser utilizado como una dependencia, es necesario instalar el proyecto en el repositorio remoto ejecutando la siguiente instrucción, dependiendo el ambiente en que se encuentre:

##### Ambiente local
```
mvn --settings settings_local.xml clean deploy
```
##### Ambiente de desarrollo (Red privada)

```
mvn --settings settings_dev.xml clean deploy
```

## Uso como dependecia 

Para utilizar la libreria como dependencia es necesario agregar al **pom.xml** del proyecto :

```xml
      <dependency>
         <groupId>mx.com.beo</groupId>
         <artifactId>redis-component</artifactId>
         <version>${redis-component.version}</version>
      </dependency>
```

## Variables de ambiente

Previo a la ejecucion del programa es necesario configurar las siguientes variables de ambiente:

```
 HOST_REDIS=127.0.0.1
 PUERTO_REDIS=6379
 PASSWORD_REDIS=kods12d48f1
```
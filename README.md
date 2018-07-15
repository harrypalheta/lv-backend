# lv-backend
Backend em Spring Boot com Banco de Dados H2 (banco em memória) para a Loja Virtual

## Dependências
* Java:
```
$ java -version
java version "1.8.0_171"
Java(TM) SE Runtime Environment (build 1.8.0_171-b11)
Java HotSpot(TM) 64-Bit Server VM (build 25.171-b11, mixed mode)
```
* Maven:
```
$ mvn -v
Apache Maven 3.5.4 (1edded0938998edf8bf061f1ceb3cfdeccf443fe; 2018-06-17T14:33:14-04:00)
Maven home: C:\Program Files\apache-maven-3.5.4
Java version: 1.8.0_171, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk1.8.0_171\jre
Default locale: pt_BR, platform encoding: Cp1252
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
```

## Inicializando o server
```sh
java -jar lv-backend.jar
```
## Build
Entre na pasta do seu projeto.
```sh
cd ~/projetos/loja-virtual
```
Rode o projeto:
```sh
mvn spring-boot:run
```
## Gerando o .jar
Na pasta do seu projeto rode:
```sh
mvn package
```

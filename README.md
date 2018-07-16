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
* GIT

## Inicializando o server
Após o `clone`. Entre na pasta do projeto.
```sh
cd ~/projetos/lv-backend
```
Rode o arquivo compilado `lv-backend*.jar` no terminal:
```sh
java -jar lv-backend*.jar
```
>Estará acessível em `http:localhost:9000`
## Rodando o projeto pelo código fonte
Na pasta do projeto, execute o comando:
```sh
mvn spring-boot:run
```
>Aqui você precisará do `H2 Database Engine` instalado.
## Gerando o .jar
Na pasta do seu projeto rode:
```sh
mvn package
```
## Acessando o Banco de Dados
Após carregar o server, vocé poderá acessar o Banco de Dados em `http://localhost:9000/h2`.
O usuário é `h2sa` e a senha é `admin`.

## Métodos
O prefixo de todos é  `http://localhost:9000/`.
 Método | Recurso | Descricão
 --------|---------|----------
 GET     |/produtos| Lista todos os produtos criados
 POST    |/produtos/create|Adiciona um produto
 PUT     |/produtos/update|Altera dados de um produto existente
 DELETE  |/produtos/delete|Exclue um produto

## Requisição
A requisição suportada é em `json`.
>Content-Type: application/json

## Dados
Os campos disponíveis estão no exemplo abaixo:

```json
{
    "id": 1,
    "nome": "Computador",
    "descricao": "Antigo",
    "preco": "100,00",
    "qtde": "10"
}
```
>Todos os campos são obrigatórios* e do tipo `String`.
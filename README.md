
# RPG API

API REST desenvolvida em Java com Spring Boot para gerenciamento de dados de um RPG.O projeto utiliza PostgreSQL como banco de dados e disponibiliza sua documentação através do Swagger/OpenAPI.

## 🚀 Tecnologias

* Java
* Spring Boot
* Spring Data JPA
* Maven
* PostgreSQL
* Swagger / OpenAPI
* Git / GitHub

## 🏗️ Arquitetura

O projeto segue uma arquitetura em camadas, separando as responsabilidades da aplicação:

```text
rpg-apie/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── ragnarok/
│   │   │           └── rpg_api/
│   │   │               ├── controller/
│   │   │               ├── service/
│   │   │               ├── repository/
│   │   │               └── RpgApiApplication.java
│   │   └── resources/
│   │       └── application.properties
│   │
│   └── test/
│
├── database/
│   ├── rpg_tables.sql
│   └── data.sql
│
├── swagger/
│   └── swagger.yaml
│
├── pom.xml
└── README.md


## 🗄️ Configuração do Banco de Dados

A aplicação utiliza PostgreSQL. Os scripts necessários para criar e popular o banco estão disponíveis na pasta `database`.

### 1. Criar o banco

Após instalar o PostgreSQL, abra o **pgAdmin** e crie um novo banco de dados.

No pgAdmin:

```text
Servers
└── PostgreSQL
    └── Databases
        └── Create
            └── Database
```

Utilize o nome:

```text
rpg_database
```

Também é possível criar através do SQL:

```sql
CREATE DATABASE rpg_database;
```

### 2. Criar as tabelas

Conecte-se ao banco `rpg_database` através do **Query Tool**.

Execute:

```text
database/rpg_tables.sql
```

Esse arquivo cria as tabelas e suas respectivas restrições.

### 3. Inserir os dados

Após criar as tabelas, execute:

```text
database/data.sql
```

Esse arquivo contém os dados iniciais utilizados pela API.

> **Importante:** execute primeiro `rpg_tables.sql` e depois `data.sql`.

## ⚙️ Configuração da API

Configure a conexão com o PostgreSQL em:

```text
src/main/resources/application.properties
```

Exemplo:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/rpg_database
spring.datasource.username=postgres
spring.datasource.password=SUA_SENHA
```

Substitua `SUA_SENHA` pela senha configurada no PostgreSQL.

> Não versionar senhas ou outras credenciais no GitHub.

## ▶️ Executando a API

Clone o projeto:

```bash
git clone https://github.com/marcospontodoc/RPG-API.git
```

Entre na pasta da aplicação:

```bash
cd RPG-API/rpg-apie
```

Execute:

```bash
mvn spring-boot:run
```

A API estará disponível em:

```text
http://localhost:8080
```

## 📚 Swagger / OpenAPI

A documentação da API está disponível no arquivo:

```text
swagger/swagger.yaml
```

O arquivo pode ser utilizado em ferramentas compatíveis com **OpenAPI/Swagger**, como Swagger Editor ou Postman.



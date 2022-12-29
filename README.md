# Client 
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/devsuperior/sds1-wmazoni/blob/master/LICENSE) 

# Sobre o projeto

Projeto desenvolvido para aprovação no módulo de CRUD do BootCamp Spring / React  da DevSuperior.

**Enunciado:**

Você deverá entregar um projeto Spring Boot 2.4.x ou superior contendo um CRUD completo de web services REST para acessar um recurso de clientes, contendo as cinco operações básicas aprendidas no capítulo:

- Busca paginada de recursos
- Busca de recurso por id
- Inserir novo recurso
- Atualizar recurso
- Deletar recurso

O projeto deverá estar com um ambiente de testes configurado acessando o banco de dados H2, deverá usar Maven como gerenciador de dependência, e Java 11 ou 17 como linguagem.

Um cliente possui nome, CPF, renda, data de nascimento, e quantidade de filhos. A especificação da entidade Client é mostrada a seguir (você deve seguir à risca os nomes de classe e atributos mostrados no diagrama):

Seu projeto deverá fazer um seed de pelo menos 10 clientes com dados SIGNIFICATIVOS (não é para usar dados sem significado como “Nome 1”, “Nome 2”, etc.).



## Modelo conceitual
![Modelo Conceitual](https://github.com/RobsonArcoleze/Client/blob/main/img/client.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- Banco h2


# Como executar o projeto

## Back end
Pré-requisitos: Java 11+

```bash
# clonar repositório
git@github.com:RobsonArcoleze/Client.git

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

# Testando o projeto

**Collection do Postman:**


https://www.getpostman.com/collections/8f7f24addf4ecba59fc1


**1)** Importação do projeto
O professor deverá ser capaz de fazer um simples clone do projeto Github, e importar e executar o mesmo no STS sem necessidade de qualquer configuração especial diferente daquelas das aulas.


**2)** Testes manuais no Postman
O professor já terá preparado em seu computador as requisições Postman abaixo. Todas elas deverão funcionar corretamente:

- Busca paginada de clientes

```
GET /clients?page=0&linesPerPage=6&direction=ASC&orderBy=name
```


- Busca de cliente por id

```
GET /clients/1
```


- Inserção de novo cliente


POST /clients
```
{
  "name": "Maria Silva",
  "cpf": "12345678901",
  "income": 6500.0,
  "birthDate": "1994-07-20T10:30:00Z",
  "children": 2
}
```


- Atualização de cliente


PUT /clients/1
```
{
  "name": "Maria Silvaaa",
  "cpf": "12345678901",
  "income": 6500.0,
  "birthDate": "1994-07-20T10:30:00Z",
  "children": 2
}
```


- Deleção de cliente

DELETE /clients/1


# Autor

Robson de Oliveira Arcoleze

https://www.linkedin.com/in/robsonarcoleze/

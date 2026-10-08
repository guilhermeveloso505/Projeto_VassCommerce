# VassCommerce

Serviço web desenvolvido para um pequeno **e-commerce**, permitindo o cadastro e consulta de produtos, clientes e pedidos.

O projeto utiliza **Spring Boot** e aplica os conceitos de **Inversão de Controle (IoC)** e **Injeção de Dependências (DI)** para manter a camada de controllers desacoplada das implementações da camada de negócio.

## Objetivo

Nesta etapa, o principal objetivo é separar a camada **Web (Controllers)** da camada de **Modelo/Negócio (Models/Services)** utilizando interfaces e os recursos de injeção de dependências do Spring.

## Principais recursos

* Cadastro e consulta de produtos;
* Pesquisa de produtos por nome e faixa de preço;
* DTOs para requisições e respostas;
* Validação utilizando `@Valid`;
* Tratamento padronizado de erros com `@RestControllerAdvice`;
* Respostas HTTP utilizando `ResponseEntity`;
* Separação entre Controller e camada de negócio;
* Injeção de dependências por construtor;
* Múltiplas implementações da regra de produtos.

## Arquitetura

A regra de negócio dos produtos é definida pela interface:

```java
ProdutoModel
```

Foram criadas duas implementações:

* `ProdutoModelMemoria` — armazenamento dos produtos em memória;
* `ProdutoModelSql` — implementação simulando um backend de banco de dados.

As implementações são registradas no Spring como `@Service` e podem ser selecionadas utilizando estratégias como `@Primary`, `@Qualifier` ou `@Profile`.

O `ProdutoController` depende apenas da interface `ProdutoModel`, não conhecendo diretamente suas implementações.

## Tecnologias

* Java
* Spring Boot
* Spring Web
* Bean Validation
* Maven
* JUnit

## Endpoints principais

### Criar produto

```http
POST /produto
```

Retorna **201 Created** quando o produto é cadastrado com sucesso.

### Buscar produto por ID

```http
GET /produto/{id}
```

Retorna **200 OK** quando encontrado ou **404 Not Found** caso não exista.

### Buscar produtos

```http
GET /produto
```

Permite realizar pesquisas utilizando nome, valor mínimo e valor máximo.

## Injeção de Dependências

O controller recebe a dependência através do construtor:

```java
public ProdutoController(ProdutoModel model) {
    this.model = model;
}
```

Dessa forma, o controller não cria diretamente nenhuma implementação de `ProdutoModel`, deixando o gerenciamento das dependências para o Spring.

## Checklist

O projeto também possui o arquivo `CHECKLIST.md`, utilizado para verificar:

* Separação entre Controller e implementações;
* Existência de pelo menos duas implementações de `ProdutoModel`;
* Uso de `@Primary`, `@Qualifier` ou `@Profile`;
* Injeção por construtor;
* Manutenção dos códigos HTTP `201`, `200` e `404`;
* Validação dos DTOs;
* Tratamento padronizado dos erros.

## Autor

**Guilherme Veloso Luciano**
Engenharia de Software — Universidade de Vassouras

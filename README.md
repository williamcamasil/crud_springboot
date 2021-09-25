# crud_springboot
sql h2 with spring boot, and maven challenge

## Passos para criação do CRUD

- Criar repositório no GITHUB
- Criar projeto usando [spring initializr](https://start.spring.io/)
- Inserir dependências no pom.xml
- Criar SQL script para a inserção de dados na tabela para inserir no arquivo data.sql que será criado
- Inserir informações no application.properties e no application-test.properties 
- Criar pacote entities para inserir classe com atributos, construtores, talvez métodos e annotations
- Criar pacote DTO para inserir classe com atributos, construtores, talvez métodos e annotations
- Criar pacote repositories para inserir classe com o objetivo de monitoramento das entidades
- Criar pacote services para declarar as operações que serão realizadas diretamente no BD
  - Criar pacote Services.Exceptions para inserir Classes para exceções de busca(ResourceNotFoundException) de 1 ítem e deletar item (DatabaseException), caso de errado
- Criar pacote Resources para inserir as Chamadas HTTP request API e conectar aos Services
  - Criar pacote de Resources.exceptions para inserir as Classes de ResourceExceptionHandler e StandardError para informar usuário em caso de erro ao executar endpoint do Service para com o BD 

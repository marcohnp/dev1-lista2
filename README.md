# dev1-lista2

### Endpoints
1. GET - http://localhost:8080/livros - Retorna lista de livros do banco H2-Database. HTTP Status: 200 - OK.
2. GET - http://localhost:8080/livros/{id} - Retorna livro de acordo com o id informado. HTTP Status: 200 - OK.
3. POST - http://localhost:8080/livros - Salva livro no banco H2-Database e retorna livro salvo. HTTP Status: 201 - Created.
4. PUT - http://localhost:8080/livros/{id} - Atualiza dados dos livro no banco H2-Database informado e retorna livro atualizado. HTTP Status: 200 - OK.
5. DELETE - http://localhost:8080/livros/{id} - Deleta banco informado do banco. Http Status: 204 - No content.

### H2-Database
H2-Database é um banco em memória utilizado para ambientes de testes. ele pode ser acessado pela url http://localhost:8080/h2-console/ não precisa de senha.

### Exceptions customizadas:
As seguintes exceptions customizadas foram implementadas:
- LivroAnoPublicacaoInvalidoException.class - HTTP Status: 400 - Bad request.
- LivroNotFoundException.class - HTTP Status: 404 - Not found.
- RequestInvalidaException.class - HTTP Status: 400 - Bad request.

### Testes Unitários
Foram implementados testes unitários.

### Exemplo de Request:
``` json
{
    "titulo": "Batalha do Apocalipse",
    "autorPrimeiroNome": "Eduardo",
    "autorSegundoNome": "Spohr",
    "anoPublicacao": "2001",
    "editora": "Versus",
    "doacao": false
}
```

### Arquitetura
Projeto foi desenvolvido utilizando o Design Pattern Facade e Mapper.

# Checklist — Separação de Responsabilidades

* [x] Controladores não fazem `new` de implementações; dependem de interfaces.
* [x] Há ao menos duas implementações `@Service` de `ProdutoModel`.
* [x] A seleção da implementação é feita por `@Qualifier`.
* [x] A injeção de dependência é realizada por construtor.
* [x] Não existe `@Autowired` em campos.
* [x] `ProdutoControlador` continua retornando HTTP 201, 200 e 404 corretamente.
* [x] A validação de `ProdutoCreateRequest` continua ativa com `@Valid`.
* [x] O JSON de erro 400 continua padronizado via `@RestControllerAdvice`.

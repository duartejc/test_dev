# Teste Prático (Back-end)

Esta aplicação foi desenvolvida utilizando *Spring Boot* e esta preparada para realizar a carga de dados (banco de dados H2) através dos arquivos **schema.sql** (DDL) e **data.sql** (carga).

Para executar a aplicação basta utilizar o seguinte comando:

	mvn spring-boot:run


#### 1) Modelagem de dados

Estão modeladas duas entidades, uma chamada **product** e outra chamada **category** (categoria de produtos), existindo um relacionamento entre elas.


#### 2) Serviços REST

A aplicação deverá expor os seguintes serviços REST:

* Listagem de todas as categorias de produtos

	http://localhost:8080/api/category/listAll

* Listagem de todos os produtos filtrados por categoria

	http://localhost:8080/api/product/listByCategory/{categoryId}

#### 3) Testes

Ao final, todos os JUnits que estão disponíveis nesse projeto deverão executar com sucesso.


## Registro de Decisões

Aqui estão registradas as decisões tomadas durante a implementação do projeto:

- [08/08/19 - 22:12] - Troca do formato do arquivo de configurações do Spring Boot, de *properties* para *[YAML](https://yaml.org/)* com objetivo de facilitar a leitura.
- [08/08/19 - 22:25] - Criação de auto relacionamento na entidade **Category** para representar uma hierarquia de categorias, padrão em sistemas que lidam com produtos e suas categorias.
- [08/08/19 - 22:26] - Inclusão da propriedade **h2:console:enable** para habilitar o console web do H2.
- [08/08/19 - 22:44] - Adoção da biblioteca Lombok para redução do código, evitando criar métodos construtores, getters e setters.
- [08/08/19 - 22:45] - Alteração da propriedade **ddl-auto: create-drop**  para **ddl-auto: none** para evitar que o hibernate recrie a base (criada via script).


## Arquitetura do Software

Esta seção provê uma visão geral da arquitetura do software.



#### Modelo Entidade Relacionamento (modelo ER)

![](docs/images/modelo-er.png)








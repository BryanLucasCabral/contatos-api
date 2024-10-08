Projeto Contatos
O projeto Contatos foi desenvolvido para fins de estudo, com o objetivo de explorar a integração entre um frontend simples em HTML, CSS e JavaScript e um backend desenvolvido em Java Spring Boot. O projeto permite o cadastro de contatos por meio de um formulário, com os dados enviados em formato JSON para o backend, que realiza o processamento e armazenamento dos contatos.

Objetivo do Projeto
O foco principal deste projeto é a comunicação entre frontend e backend utilizando requisições HTTP e o envio/recebimento de dados no formato JSON. Além disso, explora-se o fluxo completo de uma aplicação web simples.

Tecnologias Utilizadas
Frontend:
HTML: Estrutura do formulário de cadastro.
CSS: Estilização da página.
JavaScript: Comunicação com o backend via requisições fetch em JSON.
Backend:
Java 17: Linguagem de programação utilizada no backend.
Spring Boot: Framework para facilitar o desenvolvimento da API RESTful.
Spring Web: Para a criação de endpoints que recebem e retornam JSON.
Spring Data JPA (opcional): Para persistência de dados.
MySQL (opcional): Banco de dados para armazenar os contatos.
Funcionalidades
Cadastro de Contato: O frontend permite o cadastro de um novo contato com nome, sobrenome, celular e email. Esses dados são enviados ao backend em formato JSON.
Consulta de Contatos: Os contatos cadastrados podem ser consultados através de uma requisição GET, retornando a lista de contatos.
Estrutura do Projeto
Frontend
Formulário em HTML para o cadastro dos contatos.
CSS para a estilização da interface.
JavaScript para realizar requisições HTTP (fetch) e enviar os dados para o backend.
Backend
Aplicação Spring Boot com endpoints REST para receber, processar e retornar os dados dos contatos.
Possível integração com banco de dados para persistência dos contatos cadastrados.
Estrutura de Pastas
/contatos
├── frontend
│   ├── index.html        # Página principal com o formulário
│   ├── style.css         # Estilos para a página HTML
│   └── script.js         # Lógica JavaScript para realizar as requisições
└── backend
    └── src
        ├── main
        │   ├── java
        │   │   └── com.contactsapi
        │   │       ├── Contato.java            # Entidade Contato
        │   │       ├── ContatoController.java  # Controlador REST
        │   │       └── ContatoService.java     # Serviço (opcional)
        │   └── resources
        │       └── application.properties      # Configurações do Spring Boot

Como Executar o Projeto
Backend
Pré-requisitos:

Java 17 ou superior
Spring Boot
Execução:

Clone este repositório.
Navegue até o diretório do backend e execute o comando para rodar a aplicação Spring Boot:
bash
Copiar código
mvn spring-boot:run
O backend ficará disponível em http://localhost:8087.
Frontend
Pré-requisitos:

Navegador moderno
Execução:

Abra o arquivo index.html no navegador para acessar o frontend.
Teste:

Preencha o formulário de cadastro de contatos e envie os dados. Eles serão enviados ao backend e processados.
Melhorias Futuras
Implementar uma interface para listar e consultar os contatos cadastrados.
Integrar um banco de dados (MySQL ou H2) para persistência.
Adicionar validação de dados mais robusta no frontend e backend.
Implementar autenticação e autorização com Spring Security.
Contribuições
Contribuições são bem-vindas! Abra issues e envie pull requests para melhorias no projeto.

Licença
Este projeto é distribuído sob a licença MIT License.

Projeto Contatos
Este projeto Contatos foi desenvolvido para fins de estudo, explorando a integração entre um frontend simples em HTML, CSS e JavaScript e um backend em Java Spring Boot. A aplicação permite o cadastro de contatos e a consulta dos mesmos através de requisições HTTP com dados em formato JSON.

Índice
Objetivo do Projeto
Tecnologias Utilizadas
Funcionalidades
Estrutura do Projeto
Como Executar o Projeto
Executar o Backend
Executar o Frontend
Melhorias Futuras
Contribuições
Licença
Objetivo do Projeto
O objetivo deste projeto é estudar a comunicação entre frontend e backend utilizando requisições HTTP, JSON e o framework Spring Boot. O foco está no envio e recebimento de dados entre cliente e servidor.

Tecnologias Utilizadas
Frontend:
HTML5: Estrutura do formulário.
CSS3: Estilização da página.
JavaScript (ES6): Comunicação com o backend usando fetch.
Backend:
Java 17: Linguagem utilizada.
Spring Boot: Framework para a criação de APIs RESTful.
Spring Web: Para gerenciamento de endpoints HTTP.
Spring Data JPA (opcional): Persistência de dados (opcional).
MySQL (opcional): Banco de dados para armazenar os contatos (opcional).
Funcionalidades
Cadastro de Contato: O frontend permite o envio de informações de contato (nome, sobrenome, celular e email) ao backend, onde os dados são processados e, eventualmente, armazenados.
Consulta de Contatos: O backend pode retornar uma lista dos contatos cadastrados, permitindo a consulta via requisição GET.
Estrutura do Projeto
O projeto está organizado em dois diretórios principais: frontend e backend.

bash
Copiar código
contatos/
├── backend/                     # Código do backend (Spring Boot)
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/contactsapi/     # Pacotes Java do projeto
│   │   │   └── resources/
│   │   │       └── application.properties
│   ├── pom.xml                  # Dependências Maven do backend
│   └── README_BACKEND.md         # Documentação exclusiva do backend (opcional)
├── frontend/                    # Código do frontend (HTML/CSS/JS)
│   ├── index.html               # Página HTML com formulário de cadastro
│   ├── style.css                # Estilos da página HTML
│   ├── script.js                # Código JS para as requisições
│   └── README_FRONTEND.md        # Documentação exclusiva do frontend (opcional)
└── README.md                    # README principal com a visão geral do projeto
Como Executar o Projeto
Pré-requisitos
Backend: Para executar o backend, você precisa de Java 17 ou superior, e Maven para gerenciar as dependências.
Frontend: Um navegador moderno para executar a página HTML e interagir com o backend.
Executar o Backend
Clone este repositório:

bash
Copiar código
git clone https://github.com/seu-usuario/contatos.git
Navegue até a pasta do backend:

bash
Copiar código
cd contatos/backend
Execute a aplicação Spring Boot:

bash
Copiar código
mvn spring-boot:run
O backend ficará disponível em http://localhost:8087.

Executar o Frontend
Abra o arquivo index.html localizado na pasta frontend em um navegador:

bash
Copiar código
open frontend/index.html
Preencha o formulário de cadastro e clique em "Cadastrar". Os dados serão enviados ao backend em formato JSON.

Melhorias Futuras
Implementação de uma interface para listar e consultar os contatos cadastrados.
Persistência dos dados em um banco de dados (como MySQL ou H2).
Adição de validação de dados no frontend e backend.
Implementação de autenticação e autorização utilizando Spring Security.
Contribuições
Contribuições são bem-vindas! Caso tenha interesse em contribuir, abra uma issue ou envie um pull request.

Licença
Este projeto está licenciado sob a MIT License.


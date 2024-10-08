<h1>Projeto Contatos</h1>

<p>Este projeto <strong>Contatos</strong> foi desenvolvido para fins de estudo, explorando a integração entre um frontend simples em <strong>HTML, CSS e JavaScript</strong> e um backend em <strong>Java Spring Boot</strong>. A aplicação permite o cadastro de contatos e a consulta dos mesmos através de requisições HTTP com dados em formato <strong>JSON</strong>.</p>

<h2>Índice</h2>
<ul>
    <li><a href="#objetivo-do-projeto">Objetivo do Projeto</a></li>
    <li><a href="#tecnologias-utilizadas">Tecnologias Utilizadas</a></li>
    <li><a href="#funcionalidades">Funcionalidades</a></li>
    <li><a href="#estrutura-do-projeto">Estrutura do Projeto</a></li>
    <li><a href="#como-executar-o-projeto">Como Executar o Projeto</a></li>
    <ul>
        <li><a href="#executar-o-backend">Executar o Backend</a></li>
        <li><a href="#executar-o-frontend">Executar o Frontend</a></li>
    </ul>
    <li><a href="#melhorias-futuras">Melhorias Futuras</a></li>
    <li><a href="#contribuicoes">Contribuições</a></li>
    <li><a href="#licenca">Licença</a></li>
</ul>

<h2 id="objetivo-do-projeto">Objetivo do Projeto</h2>
<p>O objetivo deste projeto é estudar a comunicação entre frontend e backend utilizando requisições HTTP, JSON e o framework Spring Boot. O foco está no envio e recebimento de dados entre cliente e servidor.</p>

<h2 id="tecnologias-utilizadas">Tecnologias Utilizadas</h2>

<h3>Frontend:</h3>
<ul>
    <li><strong>HTML5</strong>: Estrutura do formulário.</li>
    <li><strong>CSS3</strong>: Estilização da página.</li>
    <li><strong>JavaScript (ES6)</strong>: Comunicação com o backend usando <code>fetch</code>.</li>
</ul>

<h3>Backend:</h3>
<ul>
    <li><strong>Java 17</strong>: Linguagem utilizada.</li>
    <li><strong>Spring Boot</strong>: Framework para a criação de APIs RESTful.</li>
    <li><strong>Spring Web</strong>: Para gerenciamento de endpoints HTTP.</li>
    <li><strong>Spring Data JPA</strong> (opcional): Persistência de dados (opcional).</li>
    <li><strong>MySQL</strong> (opcional): Banco de dados para armazenar os contatos (opcional).</li>
</ul>

<h2 id="funcionalidades">Funcionalidades</h2>
<ul>
    <li><strong>Cadastro de Contato</strong>: O frontend permite o envio de informações de contato (nome, sobrenome, celular e email) ao backend, onde os dados são processados e, eventualmente, armazenados.</li>
    <li><strong>Consulta de Contatos</strong>: O backend pode retornar uma lista dos contatos cadastrados, permitindo a consulta via requisição GET.</li>
</ul>

<h2 id="estrutura-do-projeto">Estrutura do Projeto</h2>
<p>O projeto está organizado em dois diretórios principais: <strong>frontend</strong> e <strong>backend</strong>.</p>

<pre><code>contatos/
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
</code></pre>

<h2 id="como-executar-o-projeto">Como Executar o Projeto</h2>

<h3 id="executar-o-backend">Executar o Backend</h3>
<ol>
    <li>Clone este repositório:
        <pre><code>git clone https://github.com/seu-usuario/contatos.git</code></pre>
    </li>
    <li>Navegue até a pasta do backend:
        <pre><code>cd contatos/backend</code></pre>
    </li>
    <li>Execute a aplicação Spring Boot:
        <pre><code>mvn spring-boot:run</code></pre>
    </li>
    <li>O backend ficará disponível em <code>http://localhost:8087</code>.</li>
</ol>

<h3 id="executar-o-frontend">Executar o Frontend</h3>
<ol>
    <li>Abra o arquivo <code>index.html</code> localizado na pasta <code>frontend</code> em um navegador:
        <pre><code>open frontend/index.html</code></pre>
    </li>
    <li>Preencha o formulário de cadastro e clique em "Cadastrar". Os dados serão enviados ao backend em formato JSON.</li>
</ol>

<h2 id="melhorias-futuras">Melhorias Futuras</h2>
<ul>
    <li>Implementação de uma interface para listar e consultar os contatos cadastrados.</li>
    <li>Persistência dos dados em um banco de dados (como MySQL ou H2).</li>
    <li>Adição de validação de dados no frontend e backend.</li>
    <li>Implementação de autenticação e autorização utilizando Spring Security.</li>
</ul>

<h2 id="contribuicoes">Contribuições</h2>
<p>Contribuições são bem-vindas! Caso tenha interesse em contribuir, abra uma issue ou envie um pull request.</p>

<h2 id="licenca">Licença</h2>
<p>Este projeto está licenciado sob a <a href="LICENSE">MIT License</a>.</p>

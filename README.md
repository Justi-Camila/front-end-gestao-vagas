# Front-end Gestão de Vagas

Este projeto é o front-end da aplicação **Gestão de Vagas**, desenvolvido durante o curso da **Rocketseat**. Trata-se de uma aplicação Web MVC construída com **Java** e **Spring Boot**, que atua como um cliente consumindo a API principal de gestão de vagas.

## 🚀 Tecnologias

O projeto foi desenvolvido utilizando as seguintes tecnologias:

- **Java 17+**
- **Spring Boot** (Web, Security)
- **Spring MVC** (para controle de rotas e views)
- **Thymeleaf** (Engine de template para renderização das páginas HTML)
- **RestTemplate** (Para comunicação com a API de Backend)
- **Maven** (Gerenciamento de dependências)

## ⚙️ Funcionalidades

A aplicação serve como interface para:

- **Empresas (Company):**
  - Cadastro de novas empresas.
  - Login e autenticação (gerenciamento de sessão via Spring Security).
  - Cadastro de novas vagas de emprego.
  - Listagem de vagas criadas pela empresa.
- **Candidatos (Candidate):**
  - Cadastro de perfil de candidato.

## 📍 Principais Rotas

Abaixo estão as rotas de acesso às principais páginas da aplicação (Frontend):

### 👤 Candidatos (`/candidate`)

| Funcionalidade | Rota | Descrição |
| :--- | :--- | :--- |
| **Login** | `/candidate/login` | Página de login para candidatos. |
| **Cadastro** | `/candidate/create` | Página de registro de novos candidatos. |
| **Perfil** | `/candidate/profile` | Visualização do perfil (Requer autenticação). |
| **Vagas** | `/candidate/jobs` | Listagem e filtro de vagas disponíveis (Requer autenticação). |

### 🏢 Empresas (`/company`)

| Funcionalidade | Rota | Descrição |
| :--- | :--- | :--- |
| **Login** | `/company/login` | Página de login para empresas. |
| **Cadastro** | `/company/create` | Página de registro de novas empresas. |
| **Vagas** | `/company/jobs` | Gerenciamento de vagas da empresa (Requer autenticação). |

---

## 🔧 Configuração e Execução

### Pré-requisitos

Certifique-se de ter instalado:
- Java JDK 17 ou superior
- Maven (ou utilize o wrapper `./mvnw` incluso)

### Configuração de Ambiente

A aplicação precisa saber onde a API de Backend está rodando. Verifique o seu arquivo `application.properties` e configure a URL da API.

A propriedade chave utilizada nos serviços (`CreateCompanyService`, `CreateCandidateService`, etc) é:

```properties
host.api.gestao_vagas=http://localhost:8080
```

> **Nota:** Certifique-se de que o projeto de Backend está rodando nesta porta antes de iniciar o front-end.

### Executando o projeto

Para rodar a aplicação, utilize o comando via terminal na raiz do projeto:

#### Windows:
```powershell
.\mvnw.cmd spring-boot:run
```

#### Linux/macOS:
```bash
./mvnw spring-boot:run
```

A aplicação estará disponível geralmente em `http://localhost:8081` (ou a porta definida no seu `server.port`).

---


### 🔗 Link para o repositório do Backend
``` [Justi-Camila/projeto-gestao-vagas](https://github.com/Justi-Camila/gestao-vagas)
```

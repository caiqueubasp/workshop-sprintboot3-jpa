# Projeto de Estudo: API RESTful com Spring Boot

Este projeto é um sistema de estudo desenvolvido para praticar conceitos de Java, Spring Boot, JPA/Hibernate e arquitetura de aplicações backend. O objetivo é simular uma API de vendas, com entidades como Usuário, Pedido, Produto, Categoria, Pagamento, etc.

## Sumário
- [Sobre o Projeto](#sobre-o-projeto)
- [Arquitetura](#arquitetura)
- [Tecnologias e Ferramentas](#tecnologias-e-ferramentas)
- [Como Executar](#como-executar)
- [Como Rodar os Testes](#como-rodar-os-testes)
- [Contato](#contato)

---

## Sobre o Projeto

Este projeto foi criado para fins de aprendizado, explorando:
- Criação de APIs RESTful com Spring Boot
- Persistência de dados com Spring Data JPA e Hibernate
- Estruturação de camadas (Controller, Service, Repository, Entity)
- Tratamento de exceções customizadas
- Testes automatizados

## Arquitetura

O projeto segue uma arquitetura em camadas:

- **Entities**: Representam as tabelas do banco de dados (ex: `User`, `Order`, `Product`, `Category`, `Payment`).
- **Repositories**: Interfaces que estendem `JpaRepository` para acesso ao banco de dados.
- **Services**: Camada de regras de negócio e orquestração.
- **Resources (Controllers)**: Camada de exposição da API REST.
- **Exceptions**: Tratamento centralizado de erros e exceções customizadas.

Estrutura de pacotes:
```
src/main/java/com/caiqueubasp/course/
  entities/         # Entidades JPA
  repositories/     # Repositórios Spring Data
  services/         # Serviços de negócio
  resources/        # Controllers REST
  resources/exceptions/ # Handlers de exceção
```

## Tecnologias e Ferramentas

- Java 17+
- Spring Boot 3.x
- Spring Data JPA
- Hibernate
- H2 Database (banco em memória para testes)
- Maven
- JUnit (testes)
- VS Code (IDE sugerida)

## Como Executar

### Pré-requisitos
- Java 17 ou superior instalado
- Maven instalado

### Passos
1. Clone o repositório:
   ```bash
   git clone <url-do-repo>
   cd course
   ```
2. Execute o projeto:
   ```bash
   ./mvnw spring-boot:run
   ```
   ou
   ```bash
   mvn spring-boot:run
   ```
3. Acesse a API em: [http://localhost:8080](http://localhost:8080)

### Banco de Dados
- O projeto utiliza H2 em memória por padrão. Para acessar o console H2, vá para [http://localhost:8080/h2-console](http://localhost:8080/h2-console) (usuário: `sa`, senha em branco).

## Como Rodar os Testes

Execute:
```bash
./mvnw test
```
ou
```bash
mvn test
```

## Contato

Desenvolvido por [Seu Nome].
- Email: seu.email@exemplo.com
- LinkedIn: https://www.linkedin.com/in/seu-perfil

---

> Projeto criado para fins educacionais. Sinta-se à vontade para estudar, modificar e sugerir melhorias!
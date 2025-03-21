# Odontoprev API

Este projeto é uma solução simples para o Challenge Odontoprev, implementada com Java MVC, integrada com Oracle Database e composta por um CRUD básico: **Cliente** . Além disso, o projeto disponibiliza duas telas web (desenvolvidas com Thymeleaf) para a visualização e manipulação dos dados de Clientes.

link do repositório: https://github.com/jvs4nt/OdontoprevJAVA

---

## Integrantes do Grupo

- Integrante 1: João Vitor de Santana dos Santos
- Integrante 2: Willian Daniel Oliveira Dantas
- Integrante 3: Ryan Azanha Silva

---

## Arquitetura e Diagrama de Componentes

### Abordagem
A solução adota uma arquitetura **monolítica** com separação de responsabilidades em camadas:
- **Controllers**: Exposição dos endpoints REST e renderização das páginas Thymeleaf.
- **Services**: Lógica de negócio.
- **Repositories**: Acesso e manipulação dos dados no banco de dados Oracle.
- **Models**: Representação das entidades do domínio (Cliente e Procedimento).
- **Utils**: Implementação de padrões de criação (ex.: Singleton para gerenciamento de configurações).

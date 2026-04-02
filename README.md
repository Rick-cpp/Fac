# JavaFac

Este repositório contém uma coleção de projetos e exercícios desenvolvidos em **Java** para fins acadêmicos. O projeto utiliza uma estrutura modular, permitindo a execução de diferentes sistemas (Banco, Livraria, Boletim, etc.) através de um sistema de rotas personalizado.

## Como Executar

O projeto conta com um script automatizado em Python para compilação e execução, eliminando a necessidade de configurar IDEs complexas para testes rápidos.

### Pré-requisitos:
- **JDK** (Java Development Kit) instalado e no PATH.
- **Python 3.x** instalado.

### Comando:
Na raiz do projeto, execute:
```bash
python Compiler.py
```

O script irá:
1. Localizar todos os arquivos `.java` no diretório `src`.
2. Compilar os arquivos para a pasta `bin`.
3. Executar a classe principal `app.App`.

---

## Estrutura de Projetos

O sistema é dividido em diversos módulos funcionais que podem ser acessados via menu:

- **[Livraria](src/app/projects/livraria):** Gestão de acervo de livros.
- **[Boletim](src/app/projects/boletim):** Sistema de notas e frequência escolar.
- **[Banco](src/app/projects/banco):** Simulação de operações bancárias.
- **[Carro](src/app/projects/carro):** Implementação de POO com atributos de veículos.
- **[Array](src/app/projects/array):** Exercícios de manipulação de estruturas de dados lineares.
- **[Person](src/app/projects/person):** Modelagem de entidades de usuários/pessoas.
- **[Filas/Stack](src/app/projects/filas):** Implementação de filas e pilhas.
- **[Polimorfismo](src/app/projects/polimorfismo):** Práticas avançadas de Programação Orientada a Objetos.

---

## Arquitetura Técnica

- **Linguagem:** Java (Core).
- **Interface:** CLI (Interface de Linha de Comando) reativa com loop de eventos.
- **Rotas:** Sistema de navegação centralizado em `app.pages.Routes`.
- **Automação:** Build system customizado via `Compiler.py`.

## Licença
Este projeto está sob a licença [MIT](LICENSE).
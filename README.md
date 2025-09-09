# AppToDo
Atividade de Programação Orientada a objetos - Object-Oriented Programming Activity
# 📝 ToDoList em Java (CLI)

![Java](https://img.shields.io/badge/Java-11%2B-blue?style=for-the-badge&logo=java)
![Status](https://img.shields.io/badge/Status-Concluído-green?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge)

<p align="center">
  <em>Um sistema simples de gerenciamento de tarefas (ToDoList) com interface de linha de comando, desenvolvido como um projeto para praticar os fundamentos de Java e Programação Orientada a Objetos.</em>
</p>

---

## 🚀 Sobre o Projeto

Este é um projeto acadêmico que consiste em um sistema de gerenciamento de tarefas (ToDoList) desenvolvido em Java. A aplicação roda em um terminal (CLI - Command Line Interface) e permite ao usuário realizar operações básicas de um CRUD (Create, Read, Update, Delete) para gerenciar suas atividades.

O projeto foi estruturado seguindo os princípios da **Programação Orientada a Objetos**, com uma clara separação de responsabilidades entre as camadas de Modelo, Serviço e Interface. O armazenamento dos dados é feito em memória utilizando uma `ArrayList`.

---

## ✨ Funcionalidades

-   ✅ **Criar** novas tarefas com título e descrição.
-   ✅ **Listar** todas as tarefas cadastradas, exibindo seu status (Pendente ou Concluída).
-   ✅ **Atualizar** o título e a descrição de uma tarefa existente através de seu ID.
-   ✅ **Remover** uma tarefa da lista.
-   ✅ **Marcar** uma tarefa como **Concluída**.
-   ✅ **Marcar** uma tarefa como **Pendente**.

---

## 🛠️ Tecnologias Utilizadas

-   **[Java (JDK 11 ou superior)](https://www.oracle.com/java/technologies/downloads/)**: Linguagem principal do projeto.
-   **[Git](https://git-scm.com/) & [GitHub](https://github.com/)**: Para versionamento e hospedagem do código.

---

## 📂 Estrutura de Pastas

O projeto foi organizado em pacotes para garantir a separação de responsabilidades e facilitar a manutenção do código.

```bash
ToDoListJava/
├── .gitignore
├── README.md
└── src/
    └── ucb/
        └── aplicacao/
            ├── cli/
            │   └── AppToDo.java # Interface com o usuário
            ├── model/
            │   └── Atividade.java # Modelo de dados da tarefa
            └── service/
                └── AtividadeServico.java # Lógica de negócio (CRUD)
```
*(Nota: Os nomes `TodoListConsole.java` e `Atividade.java` podem variar dependendo da sua implementação.)*


## 🎮 Exemplo de Uso

Após executar o programa, o menu principal será exibido no terminal:

```bash
--- ToDoList - Gerenciador de Tarefas ---
1. Criar Tarefa
2. Listar Todas as Tarefas
3. Atualizar Tarefa
4. Remover Tarefa
5. Marcar Tarefa como Concluída
6. Marcar Tarefa como Pendente
0. Sair
Escolha uma opção: 1
Digite o título da tarefa: Estudar Java
Digite a descrição da tarefa: Revisar os conceitos de POO e Collections.
Tarefa criada com sucesso!

Pressione Enter para continuar...

--- ToDoList - Gerenciador de Tarefas ---
1. Criar Tarefa
2. Listar Todas as Tarefas
...
Escolha uma opção: 2

--- Lista de Tarefas ---
ID: 1 | [PENDENTE] Estudar Java
  Descrição: Revisar os conceitos de POO e Collections.
  Criada em: 09/09/2025 18:00
```

---

## 👨‍💻 Autor

Feito por **Eduardo VCieira Ponce**.

[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/EduVPF)

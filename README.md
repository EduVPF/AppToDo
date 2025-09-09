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
ToDoList - Gerenciador de Tarefas
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

ToDoList - Gerenciador de Tarefas
1. Criar Tarefa
2. Listar Todas as Tarefas
...
Escolha uma opção: 2

Lista de Tarefas
ID: 1 | [PENDENTE] Estudar Java
  Descrição: Revisar os conceitos de POO e Collections.
  Criada em: 09/09/2025 18:00
```

---

## 👨‍💻 Autor

Feito por **Eduardo Vieira Ponce**.

[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/EduVPF)




# 📝 ToDoList in Java (CLI)

![Java](https://img.shields.io/badge/Java-11%2B-blue?style=for-the-badge&logo=java)
![Status](https://img.shields.io/badge/Status-Completed-green?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge)

<p align="center">
  <em>A simple task management system (ToDoList) with a command-line interface, developed as a project to practice the fundamentals of Java and Object-Oriented Programming.</em>
</p>

---

## 🚀 About the Project

This is an academic project consisting of a task management system (ToDoList) developed in Java. The application runs in a terminal (CLI - Command Line Interface) and allows the user to perform basic CRUD (Create, Read, Update, Delete) operations to manage their activities.

The project was structured following the principles of **Object-Oriented Programming (OOP)**, with a clear separation of responsibilities between the Model, Service, and Interface layers. Data storage is handled in-memory using an `ArrayList`.

---

## ✨ Features

-   ✅ **Create** new tasks with a title and description.
-   ✅ **List** all registered tasks, displaying their status (Pending or Completed).
-   ✅ **Update** the title and description of an existing task using its ID.
-   ✅ **Remove** a task from the list.
-   ✅ **Mark** a task as **Completed**.
-   ✅ **Mark** a task as **Pending**.

---

## 🛠️ Technologies Used

-   **[Java (JDK 11 or higher)](https://www.oracle.com/java/technologies/downloads/)**: The main language of the project.
-   **[Git](https://git-scm.com/) & [GitHub](https://github.com/)**: For version control and code hosting.

---

## 📂 Folder Structure

The project was organized into packages to ensure separation of responsibilities and facilitate code maintenance.

```bash
ToDoListJava/
├── .gitignore
├── README.md
└── src/
    └── ucb/
        └── aplicacao/
            ├── cli/
            │   └── AppToDo.java # User Interface
            ├── model/
            │   └── Atividade.java # Task data model
            └── service/
                └── AtividadeServico.java # Business logic (CRUD)
```

## 🎮 Usage Example

After running the program, the main menu will be displayed in the terminal:

```bash
--- ToDoList - Task Manager ---
1. Create Task
2. List All Tasks
3. Update Task
4. Remove Task
5. Mark Task as Completed
6. Mark Task as Pending
0. Exit
Choose an option: 1
Enter the task title: Study Java
Enter the task description: Review OOP and Collections concepts.
Task created successfully!

Press Enter to continue...

ToDoList - Task Manager
1. Create Task
2. List All Tasks
...
Choose an option: 2

Task List
ID: 1 | [PENDING] Study Java
  Description: Review OOP and Collections concepts.
  Created at: 09/09/2025 18:00
```

---

## 👨‍💻 Author

Made by **Eduardo Vieira Ponce**.

[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/EduVPF)

---

## 📜 License

This project is licensed under the MIT License.

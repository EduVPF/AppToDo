package ucb.aplicacao.cli;

import ucb.aplicacao.model.Atividade;
import ucb.aplicacao.service.AtividadeServico;

import java.util.List;
import java.util.Scanner;

public class AppToDo {

    private static final AtividadeServico servico = new AtividadeServico();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = -1;
        while (opcao != 0) {
            exibirMenu();
            try {
                opcao = Integer.parseInt(scanner.nextLine());
                roteador(opcao);
            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número.");
            }
        }
        scanner.close();
    }

    private static void roteador(int opcao) {
        switch (opcao) {
            case 1 -> criarTarefa();
            case 2 -> listarTarefas();
            case 3 -> atualizarTarefa();
            case 4 -> removerTarefa();
            case 5 -> marcarTarefa(true);
            case 6 -> marcarTarefa(false);
            case 0 -> System.out.println("Encerrando o sistema...");
            default -> System.out.println("Opção inválida.");
        }
        if (opcao != 0) {
            pressioneEnterParaContinuar();
        }
    }

    private static void exibirMenu() {
        System.out.println("\nToDoList - Gerenciador de Tarefas");
        System.out.println("1. Criar Tarefa");
        System.out.println("2. Listar Todas as Tarefas");
        System.out.println("3. Atualizar Tarefa");
        System.out.println("4. Remover Tarefa");
        System.out.println("5. Marcar Tarefa como Concluída");
        System.out.println("6. Marcar Tarefa como Pendente");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void criarTarefa() {
        System.out.print("Digite o título da tarefa: ");
        String titulo = scanner.nextLine();
        System.out.print("Digite a descrição da tarefa: ");
        String descricao = scanner.nextLine();
        servico.criar(titulo, descricao);
        System.out.println("Tarefa criada com sucesso!");
    }

    private static void listarTarefas() {
        List<Atividade> tarefas = servico.listar();
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            System.out.println("\nLista de Tarefas");
            tarefas.forEach(System.out::println);
        }
    }

    private static void atualizarTarefa() {
        System.out.print("Digite o ID da tarefa para atualizar: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Digite o novo título: ");
        String novoTitulo = scanner.nextLine();
        System.out.print("Digite a nova descrição: ");
        String novaDescricao = scanner.nextLine();
        if (servico.atualizar(id, novoTitulo, novaDescricao)) {
            System.out.println("Tarefa atualizada com sucesso!");
        } else {
            System.out.println("Erro: Tarefa não encontrada.");
        }
    }

    private static void removerTarefa() {
        System.out.print("Digite o ID da tarefa para remover: ");
        int id = Integer.parseInt(scanner.nextLine());
        if (servico.remover(id)) {
            System.out.println("Tarefa removida com sucesso!");
        } else {
            System.out.println("Erro: Tarefa não encontrada.");
        }
    }

    private static void marcarTarefa(boolean status) {
        System.out.print("Digite o ID da tarefa para alterar o status: ");
        int id = Integer.parseInt(scanner.nextLine());
        if (servico.marcarStatus(id, status)) {
            String novoStatus = status ? "CONCLUÍDA" : "PENDENTE";
            System.out.printf("Tarefa marcada como %s com sucesso!\n", novoStatus);
        } else {
            System.out.println("Erro: Tarefa não encontrada.");
        }
    }

    private static void pressioneEnterParaContinuar() {
        System.out.println("\nPressione Enter para continuar...");
        scanner.nextLine();
    }
}
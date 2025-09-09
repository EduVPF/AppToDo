package ucb.aplicacao.service;

import ucb.aplicacao.model.Atividade;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AtividadeServico {

    private final List<Atividade> bancoDeTarefas = new ArrayList<>();
    private int proximoId = 1;

    private Optional<Atividade> buscarPorId(int id) {
        return bancoDeTarefas.stream().filter(t -> t.getId() == id).findFirst();
    }

    public void criar(String titulo, String descricao) {
        bancoDeTarefas.add(new Atividade(proximoId++, titulo, descricao));
    }

    public List<Atividade> listar() {
        return new ArrayList<>(bancoDeTarefas);
    }

    public boolean atualizar(int id, String novoTitulo, String novaDescricao) {
        Optional<Atividade> tarefaOpt = buscarPorId(id);
        if (tarefaOpt.isPresent()) {
            Atividade tarefa = tarefaOpt.get();
            tarefa.setTitulo(novoTitulo);
            tarefa.setDescricao(novaDescricao);
            return true;
        }
        return false;
    }

    public boolean remover(int id) {
        return bancoDeTarefas.removeIf(tarefa -> tarefa.getId() == id);
    }

    public boolean marcarStatus(int id, boolean status) {
        Optional<Atividade> tarefaOpt = buscarPorId(id);
        if (tarefaOpt.isPresent()) {
            tarefaOpt.get().setCompleta(status);
            return true;
        }
        return false;
    }
}
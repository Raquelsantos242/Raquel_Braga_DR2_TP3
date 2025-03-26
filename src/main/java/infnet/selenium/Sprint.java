package infnet.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Sprint {
    private String nome;
    private String dataInicio;
    private String dataFim;
    private List<Task> tarefas;

    public Sprint(String nome, String dataInicio, String dataFim) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.tarefas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarTarefa(Task tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(Task tarefa) {
        tarefas.remove(tarefa);
    }

    public void listarTarefas() {
        for (Task tarefa : tarefas) {
            tarefa.exibirDetalhes();
        }
    }
}

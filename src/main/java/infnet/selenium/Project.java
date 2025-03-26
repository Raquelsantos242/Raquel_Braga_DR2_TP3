package infnet.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Project {
    String nome;
    private String descricao;
    private List<Sprint> sprints;

    public Project(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.sprints = new ArrayList<>();
    }

    public void adicionarSprint(Sprint sprint) {
        sprints.add(sprint);
    }

    public void removerSprint(Sprint sprint) {
        sprints.remove(sprint);
    }

    public void listarSprints() {
        for (Sprint sprint : sprints) {
            System.out.println("Sprint: " + sprint.getNome());
        }
    }
}

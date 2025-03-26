package infnet.selenium;

class Task {
    private String titulo;
    private String descricao;
    private String status;
    private User responsavel;

    public Task(String titulo, String descricao, String status, User responsavel) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
        this.responsavel = responsavel;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getStatus() {
        return status;
    }

    public User getResponsavel() {
        return responsavel;
    }

    public void atualizarResponsavel(User novoResponsavel) {
        this.responsavel = novoResponsavel;
    }

    public void alterarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public void exibirDetalhes() {
        System.out.println("Tarefa: " + titulo + ", Status: " + status + ", Responsável: " + responsavel.getNome());
    }
}
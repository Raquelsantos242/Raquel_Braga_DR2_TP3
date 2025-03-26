package infnet.selenium;

public final class Item {
    private final String codigoProduto;
    private final int quantidade;
    private final double precoUnitario;

    public Item(String codigoProduto, int quantidade, double precoUnitario) {
        if (codigoProduto == null || codigoProduto.trim().isEmpty()) {
            throw new IllegalArgumentException("Código do produto não pode ser nulo ou vazio.");
        }
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser negativa.");
        }
        if (precoUnitario < 0) {
            throw new IllegalArgumentException("Preço unitário não pode ser negativo.");
        }

        this.codigoProduto = codigoProduto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public Item atualizarQuantidade(int novaQuantidade) {
        if (novaQuantidade < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser negativa.");
        }
        return new Item(this.codigoProduto, novaQuantidade, this.precoUnitario);
    }

    public double calcularValorTotal() {
        return this.quantidade * this.precoUnitario;
    }

    @Override
    public String toString() {
        return "Item [codigoProduto=" + codigoProduto + ", quantidade=" + quantidade + ", precoUnitario=" + precoUnitario + "]";
    }
}

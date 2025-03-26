package infnet.selenium;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public final class Order {
    private final int id;
    private final String date;
    private final String status;
    private final List<Item> items;

    public Order(int id, String date, String status, List<Item> items) {
        if (items == null || items.isEmpty()) {
            throw new IllegalArgumentException("A lista de itens não pode ser nula ou vazia.");
        }

        this.id = id;
        this.date = date;
        this.status = status;
        this.items = new ArrayList<>(items);
    }

    public int getId() { return id; }
    public String getDate() { return date; }
    public String getStatus() { return status; }
    public List<Item> getItems() { return Collections.unmodifiableList(items);
    }

    public Order updateStatus(String newStatus) {
        return new Order(this.id, this.date, newStatus, this.items);   }

    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.calcularValorTotal();
        }
        return total;
    }

    public void displayOrder() {
        System.out.println("Pedido #" + id + " - Data: " + date + " - Status: " + status);
        System.out.println("Itens:");
        for (Item item : items) {
            System.out.println("- " + item.getCodigoProduto() + " (x" + item.getQuantidade() + "): R$ " + item.getPrecoUnitario());
        }
        System.out.println("Total: R$ " + calculateTotal());
    }
}

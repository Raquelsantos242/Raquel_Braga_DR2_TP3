package infnet.selenium;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Record {
    private final String id;
    private final BigDecimal value;
    private final LocalDateTime creationDate;
    private final LocalDateTime lastUpdateDate;
    private final Status status;
    private final int quantity; // Atributo de quantidade de itens

    public enum Status {
        PENDING, COMPLETED, CANCELED
    }

    public Record(String id, BigDecimal value, LocalDateTime creationDate, Status status, int quantity) {
        this.id = id;
        this.value = value;
        this.creationDate = creationDate;
        this.lastUpdateDate = creationDate;
        this.status = status;
        this.quantity = quantity; // Inicialização da quantidade
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValue() {
        return value;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public LocalDateTime getLastUpdateDate() {
        return lastUpdateDate;
    }

    public Status getStatus() {
        return status;
    }

    public int getQuantity() {
        return quantity;
    }

    public Record updateStatus(Status newStatus) {
        return new Record(this.id, this.value, this.creationDate, newStatus, this.quantity);
    }

    public Record updateValue(BigDecimal newValue) {
        return new Record(this.id, newValue, this.creationDate, this.status, this.quantity);
    }public Record updateLastUpdateDate(LocalDateTime newDate) {
        return new Record(this.id, this.value, this.creationDate, this.status, this.quantity);
    }

    public Record updateQuantity(int newQuantity) {
        return new Record(this.id, this.value, this.creationDate, this.status, newQuantity);
    }
}

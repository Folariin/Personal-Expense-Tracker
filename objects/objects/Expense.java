package objects;

import java.time.LocalDate;

public class Expense {
    private String category;
    private float amount;
    private LocalDate date;
    private String note;

    public Expense(String category, float amount, LocalDate date, String note) {
        this.category = category;
        this.amount = amount;
        this.date = date;
        this.note = note;
    }

    public String getCategory() {
        return category;
    }

    public float getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getNote() {
        return note;
    }

    public String toString() {
        return String.format("$%.2f | %-10s | %s | %s", amount, category, date, note);
    }

}

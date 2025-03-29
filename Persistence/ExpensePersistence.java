package Persistence;

import objects.Expense;
import java.util.*;

import Persistence.interfaces.ExpensePersistenceInterface;

public class ExpensePersistence implements ExpensePersistenceInterface {
    private List<Expense> expenses;

    public ExpensePersistence() {
        this.expenses = new ArrayList<>();
    }

    @Override
    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    @Override
    public void deleteExpense(Expense expense) {
        expenses.remove(expense);
    }

    @Override
    public List<Expense> listExpenses() {
        return expenses;
    }

    @Override
    public List<Expense> findByCategory(String category) {
        List<Expense> categories = new ArrayList<>();
        for (Expense expense : expenses) {
            if (expense.getCategory().equalsIgnoreCase(category)) {
                categories.add(expense);
            }
        }
        return categories;
    }
}

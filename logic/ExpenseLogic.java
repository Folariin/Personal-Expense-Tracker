package logic;

import Persistence.interfaces.ExpensePersistenceInterface;
import objects.Expense;

import java.time.LocalDate;
import java.util.List;

public class ExpenseLogic {
    private ExpensePersistenceInterface expenseStore;

    public ExpenseLogic(ExpensePersistenceInterface expenseStore) {
        this.expenseStore = expenseStore;
    }

    public void addExpense(String category, float amount, String note) {
        Expense expense = new Expense(category, amount, LocalDate.now(), note);
        expenseStore.addExpense(expense);
    }

    public void deleteExpense(Expense expense) {
        expenseStore.deleteExpense(expense);
    }

    public List<Expense> listExpenses() {
        return expenseStore.listExpenses();
    }

    public List<Expense> findByCategory(String category) {
        return expenseStore.findByCategory(category);
    }
}

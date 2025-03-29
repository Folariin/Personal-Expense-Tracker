package Persistence.interfaces;

import java.util.List;
import objects.Expense;

public interface ExpensePersistenceInterface {
    void addExpense(Expense expense);
    void deleteExpense(Expense expense);
    List <Expense> listExpenses(); // Might be better to return a List too
    List<Expense> findByCategory(String category);
}

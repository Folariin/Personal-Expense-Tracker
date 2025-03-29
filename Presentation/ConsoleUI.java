package Presentation;

import logic.ExpenseLogic;
import objects.Expense;

import java.util.List;
import java.util.Scanner;

public class ConsoleUI {
    private final ExpenseLogic logic;
    private final Scanner scanner;

    public ConsoleUI(ExpenseLogic logic) {
        this.logic = logic;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            showMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> addExpense();
                case "2" -> viewExpenses();
                case "3" -> findByCategory();
                case "4" -> exitApp();
                default -> System.out.println("❗ Invalid choice. Try again.");
            }
        }
    }

    private void showMenu() {
        System.out.println("\n==== Personal Expense Tracker ====");
        System.out.println("1. Add Expense");
        System.out.println("2. View All Expenses");
        System.out.println("3. Find by Category");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private void addExpense() {
        System.out.print("Enter category: ");
        String category = scanner.nextLine();
        System.out.print("Enter amount: ");
        float amount = Float.parseFloat(scanner.nextLine());
        System.out.print("Enter note (optional): ");
        String note = scanner.nextLine();

        logic.addExpense(category, amount, note);
        System.out.println("Expense added!");
    }

    private void viewExpenses() {
        List<Expense> expenses = logic.listExpenses();
        if (expenses.isEmpty()) {
            System.out.println("No expenses yet.");
        } else {
            System.out.println("\n--- All Expenses ---");
            expenses.forEach(System.out::println);
        }
    }

    private void findByCategory() {
        System.out.print("Enter category to search: ");
        String category = scanner.nextLine();
        List<Expense> filtered = logic.findByCategory(category);

        if (filtered.isEmpty()) {
            System.out.println("No expenses found.");
        } else {
            System.out.println("\n--- Matching Expenses ---");
            filtered.forEach(System.out::println);
        }
    }

    private void exitApp() {
        System.out.println("Goodbye!");
        scanner.close();
        System.exit(0);
    }
}

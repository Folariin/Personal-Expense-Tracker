package Presentation;
import logic.ExpenseLogic;
import Persistence.ExpensePersistence;


public class Main {
    public static void main(String[] args) {
        ExpenseLogic logic = new ExpenseLogic(new ExpensePersistence());
        ConsoleUI ui = new ConsoleUI(logic);
        ui.start(); // Start the menu
    }
}


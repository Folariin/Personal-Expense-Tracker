# Personal Expense Tracker (Console Edition)

A simple and modular **Java console application** for tracking daily expenses. Built using clean architecture principles and following SOLID design, this app serves as a great starting point for beginners and a solid foundation for expansion.

---

## 📌 Features

- Add new expenses (category, amount, note, and date)
- View all recorded expenses
- Filter expenses by category
- Interface-based persistence
- Modular architecture using packages
- Clean, readable console UI

---

## Project Structure
 It follows the 3-tier architecture.

```
PersonalExpenseTracker/
├── objects/
│   └── Expense.java
├── logic/
│   └── ExpenseLogic.java
├── Persistence/
│   ├── ExpensePersistence.java
│   └── interfaces/
│       └── ExpensePersistenceInterface.java
└── Presentation/
    └── Main.java
    └── ConsoleUI.java
```

---

## How It Works

1. `Main.java` starts the app.
2. `ConsoleUI` handles all user input/output.
3. `ExpenseLogic` contains the app logic.
4. `ExpensePersistence` manages in-memory storage using a list.
5. The app runs in a loop, letting users:
   - Add expenses
   - View all expenses
   - Filter by category
   - Exit cleanly

---

## How to Run

### Requirements

- Java 8 or higher
- Terminal or Command Prompt

### Compile from the root folder:

```bash
javac ui\ConsoleUI.java logic\ExpenseLogic.java Persistence\ExpensePersistence.java Persistence\interfaces\ExpensePersistenceInterface.java objects\Expense.java Main.java
```

### Run the program:

```bash
java Main
```

---

## SOLID Principles Used

- **Single Responsibility Principle:** Each class has one job (e.g., data, logic, UI, persistence).
- **Open/Closed Principle:** New features can be added without changing existing logic (e.g., file persistence).
- **Interface Segregation & Dependency Inversion:** Logic layer depends on interfaces instead of concrete implementations.

---

## Possible Future Enhancements

- [ ] Delete or edit expense entries by ID
- [ ] Sort expenses (by amount, date)
- [ ] Group expenses by month
- [ ] View totals per category/month
- [ ] Save/load expenses to a file (JSON, CSV)
- [ ] Export to CSV
- [ ] Build a GUI using JavaFX

---

## Author

**Amusat Farouk**  
University of Manitoba – Computer Science (3rd Year)  

---

## License

This project is open-source and available under the [MIT License](https://opensource.org/licenses/MIT).

---

## Contributions

Contributions, feedback, and suggestions are welcome! Feel free to fork the repo and submit pull requests.
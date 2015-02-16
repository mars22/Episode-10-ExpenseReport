package expenseReport;

import java.util.ArrayList;
import java.util.List;


public class ExpenseReport {
    private List<Expense> expenses = new ArrayList<Expense>();
    private int mealExpenses;
    private int total;

    public ExpenseReport() {
        this.mealExpenses =0;
        this.total = 0;
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);

    }

    public void totalUpExpencies(){
        for (Expense expense:expenses)
            addToTotals(expense);
    }

    private void addToTotals(Expense expense) {
        if (expense.isMeal())
            mealExpenses += expense.getAmount();
        total += expense.getAmount();
    }


    public List<Expense> GetExpenses() {
        return expenses;
    }


    public double GetTotalExponses() {
        return total;
    }

    public double GetTotalMealExpenses() {
        return mealExpenses;
    }
}

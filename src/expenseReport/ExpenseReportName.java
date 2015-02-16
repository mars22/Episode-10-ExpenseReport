package expenseReport;

/**
 * Created by marcin on 16.02.15.
 */
public class ExpenseReportName {
    public String getName(Expense expense) {
        String name;
        if (expense instanceof DinnerExpense)
            name = "Dinner";
        else if (expense instanceof BreakFastExpense)
            name = "Breakfast";
        else if (expense instanceof CarRentalExpense)
            name = "Car Rental";
        else
            name = "TILT";
        return name;
    }
}

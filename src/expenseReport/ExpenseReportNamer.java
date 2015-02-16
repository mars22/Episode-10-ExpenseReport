package expenseReport;

/**
 * Created by marcin on 16.02.15.
 */
public class ExpenseReportNamer implements ExpenseNamer {
    @Override
    public String getName(Expense expense) {
        if (expense instanceof DinnerExpense)
            return "Dinner";
        else if (expense instanceof BreakFastExpense)
            return "Breakfast";
        else if (expense instanceof CarRentalExpense)
            return "Car Rental";

        return  "TILT";
    }
}

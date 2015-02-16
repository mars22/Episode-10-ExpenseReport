package expenseReport;

import java.util.Locale;

/**
 * Created by marcin on 16.02.15.
 */
public class ExpenseReporter {

    private ExpenseReport report;
    private ExpenseNamer expanseNamer;
    private ReportPrinter printer;
    public ExpenseReporter(ExpenseReport report, ExpenseNamer expanseNamer) {

        Locale.setDefault(new Locale("en", "US"));

        this.report = report;

        this.expanseNamer = expanseNamer;
    }

    public void printReport(ReportPrinter printer) {

        this.printer = printer;

        report.totalUpExpencies();

        printExpensesAndTotals();
    }

    private void printExpensesAndTotals() {
        printHeader();
        for (Expense expense : report.GetExpenses())
            printExpanse(expense);

        printTotals();
    }

    private void printHeader() {
        printer.print("Expenses " + getDate() + "\n");
    }

    private void printExpanse(Expense expense) {

        String prefix = expense.isOverage() ? "X" : " ";

        printer.print(String.format("%s\t%s\t$%.02f\n", prefix,
                expanseNamer.getName(expense), getPeny(expense.getAmount())));
    }

    private void printTotals() {
        printer.print(String.format("\nMeal expenses $%.02f", getPeny(report.GetTotalMealExpenses())));
        printer.print(String.format("\nTotal $%.02f", getPeny(report.GetTotalExponses())));
    }



    private double getPeny(double amount) {
        return amount / 100.0;
    }


    private String getDate() {
        return "9/12/2002";
    }
}

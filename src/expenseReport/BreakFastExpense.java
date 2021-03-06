package expenseReport;

/**
 * Created by marcin on 16.02.15.
 */
public class BreakFastExpense extends Expense {

    public BreakFastExpense(int amount) {
        super(amount);
    }

    @Override
    public boolean isMeal() {
        return true;
    }

    @Override
    public boolean isOverage() {
        return getAmount() > 1000;
    }
}

package expenseReport;

/**
 * Created by marcin on 16.02.15.
 */
public class CarRentalExpense extends Expense {
    public CarRentalExpense(int amount) {
        super(amount);
    }

    @Override
    public boolean isMeal() {
        return false;
    }

    @Override
    public boolean isOverage() {
        return false;
    }
}

package expenseReport;

public abstract class Expense {
    private int amount;

    public Expense(int amount) {
        this.amount = amount;
    }

    public abstract boolean isMeal();

    public abstract boolean isOverage();


    public int getAmount() {
        return amount;
    }
}

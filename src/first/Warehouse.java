package first;

public class Warehouse {
    private int countOrder;
    private double balance;

    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "\ncountOrder: " + countOrder +
                "\nbalance: " + balance;
    }
}

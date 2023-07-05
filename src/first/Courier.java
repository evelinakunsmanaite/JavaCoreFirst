package first;

public class Courier implements Worker {
    private double salary;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    Warehouse warehouse;

    public double getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setBalance(warehouse.getBalance() + 1000);
        System.out.println("ЗП доставщика " + salary);

        if (warehouse.getBalance() <= 1000000) {
            bonus();
        }
    }

    @Override
    public void bonus() {
        salary *= 2;
        System.out.println("ЗП доставщика с бонусами " + salary);
    }
}

package first;

public class Picker implements Worker {
    private double salary;
    Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);
        System.out.println("ЗП сборщика " + salary);

        if (warehouse.getCountOrder() >= 1500) {
            bonus();
        }
    }


    @Override
    public void bonus() {
        salary *= 3;
        System.out.println("ЗП сборщика с бонусами " + salary);
    }
}
public class Airplane {
    private String producer;
    private int year;
    private double length;
    private double weight;
    private double fuel = 0;

    public Airplane(String producer, int year, double length, double weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public double getFuel() {
        return fuel;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void info() {
        System.out.println("Производитель: " + producer);
        System.out.println("Год выпуска: " + year);
        System.out.println("Длина: " + length);
        System.out.println("Вес: " + weight);
        System.out.println("Топливо: " + fuel);
    }

    public double fillUp(double plusFuel) {
        fuel = plusFuel;
        return fuel;
    }

    public static void compareAirplanes(Airplane airplaneOne, Airplane airplaneTwo) {
        if (airplaneOne.getLength() > airplaneTwo.getLength()) {
            System.out.println("\nДлиннее самолёт: ");
            airplaneOne.info();
        } else if (airplaneOne.getLength() < airplaneTwo.getLength()) {
            System.out.println("\nДлиннее самолёт: ");
            airplaneTwo.info();
        } else {
            System.out.println("\nДлины самолётов равны");
        }
    }

    @Override
    public String toString() {
        return "Airplane:" +
                "\nproducer: " + producer +
                "\nyear: " + year +
                "\nlength: " + length +
                "\nweight: " + weight +
                "\nfuel: " + fuel;
    }
}

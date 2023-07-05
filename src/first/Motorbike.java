package first;

public class Motorbike {
    private int year;
    private String color, model;

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public void info() {
        System.out.println("\nЭто мотоцикл!");
    }

    public int yearDifference(int diffYear) {
        return Math.abs(diffYear - year);
    }

    @Override
    public String toString() {
        return "\nyear: " + year +
                "\ncolor: " + color +
                "\nmodel: " + model;
    }
}

public class Motorbike {
    private int year;
    private String color, model;

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    @Override
    public String toString() {
        return "\nyear: " + year +
                "\ncolor: " + color +
                "\nmodel: " + model;
    }
}

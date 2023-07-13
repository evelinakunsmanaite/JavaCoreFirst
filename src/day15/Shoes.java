package day15;

public class Shoes {
    private String name;
    private int size;
    private int quantity;

    public Shoes(String name, int size, int quality) {
        this.name = name;
        this.size = size;
        this.quantity = quality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getQuality() {
        return quantity;
    }

    public void setQuality(int quality) {
        this.quantity = quality;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", quality=" + quantity +
                '}' + "\n";
    }
}

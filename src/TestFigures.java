public class TestFigures {
    public static void main() {
        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 10, 20, 30),
                new Triangle("Red", 10, 20, 15),
                new Rectangle("Red", 5, 10),
                new Rectangle("Orange", 40, 15),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blue", 5)
        };

        System.out.println("Суммы всех площадей: " + calculateRedArea(figures));
        System.out.println("Суммы всех периметров: " +calculateRedPerimeter(figures));

    }

    private static double calculateRedPerimeter(Figure[] figures) {
        double perimeterSum = 0;

        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                perimeterSum += figure.perimeter();
            }
        }
        return perimeterSum;
    }

    private static double calculateRedArea(Figure[] figures) {
        double areaSum = 0;

        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                areaSum += figure.area();
            }
        }
        return areaSum;
    }
}

package first;

public class Triangle extends Figure {
    private double lengthFirstSide;
    private double lengthSecondSide;
    private double lengthThirdSide;


    public Triangle(String color, double lengthFirstSide, double lengthSecondSide, double lengthThirdSide) {
        super(color);
        this.lengthFirstSide = lengthFirstSide;
        this.lengthSecondSide = lengthSecondSide;
        this.lengthThirdSide = lengthThirdSide;

    }

    private boolean isExist() {
        if ((lengthFirstSide + lengthSecondSide < lengthThirdSide) ||
                (lengthFirstSide + lengthThirdSide < lengthSecondSide) ||
                (lengthSecondSide + lengthThirdSide < lengthFirstSide)) {
            System.out.println("Такого треугольника не существует!!!");
            return false;
        } else return true;
    }

    @Override
    public double area() {
        if (isExist()) {
            double p = perimeter() / 2;
            return Math.sqrt(p * (p - lengthFirstSide) * (p - lengthSecondSide) * (p - lengthThirdSide));
        }
        return 0;
    }

    @Override
    public double perimeter() {
        if (isExist()) {
            return lengthFirstSide + lengthSecondSide + lengthThirdSide;
        }
        return 0;
    }
}

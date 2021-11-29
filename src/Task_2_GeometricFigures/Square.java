package Task_2_GeometricFigures;

public class Square extends GeometricFigures{
    private static final String NAME = "Square";
    private final double side;

    public Square(double x, double y, double side) {
        super(x, y);
        this.side = side;
    }

    @Override
    double getPerimeter() {
        return (side * 4);
    }

    @Override
    double getArea() {
        return (side * side);
    }

    @Override
    public String getName() {
        return NAME;
    }
}

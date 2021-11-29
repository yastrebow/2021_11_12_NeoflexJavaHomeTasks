package Task_2_GeometricFigures;

public class Point extends GeometricFigures {
    private static final String NAME = "Point";

    public Point(double x, double y) {
        super(x, y);
    }

    @Override
    double getPerimeter() {
        return 0;
    }

    @Override
    double getArea() {
        return 0;
    }

    @Override
    public String getName() {
        return NAME;
    }
}

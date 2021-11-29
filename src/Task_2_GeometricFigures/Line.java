package Task_2_GeometricFigures;

public class Line extends GeometricFigures{
    private static final String NAME = "Line";
    public double length;

    public Line(double x, double y, double length) {
        super(x, y);
        this.length = length;
    }

    @Override
    double getPerimeter() {
        return length;
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

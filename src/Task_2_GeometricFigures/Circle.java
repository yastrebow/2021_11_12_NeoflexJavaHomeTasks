package Task_2_GeometricFigures;

public class Circle extends GeometricFigures{
    private static final String NAME = "Circle";
    public double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return (2*Math.PI*radius);
    }

    @Override
    double getArea() {
        return (Math.PI * radius * radius);
    }

    @Override
    public String getName() {
        return NAME;
    }
}

package Task_2_GeometricFigures;

public class Rectangle extends GeometricFigures {
    private static final String NAME = "Rectangle";
    private final double width;
    private final double height;

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    double getPerimeter() {
        return (2*(width + height));
    }

    @Override
    double getArea() {
        return (width * height);
    }

    @Override
    public String getName() {
        return NAME;
    }
}

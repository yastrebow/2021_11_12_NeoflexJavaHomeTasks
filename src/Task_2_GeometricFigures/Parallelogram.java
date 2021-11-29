package Task_2_GeometricFigures;

public class Parallelogram extends GeometricFigures {
    private static final String NAME = "Parallelogram";
    private final double sideA;
    private final double sideB;

    public Parallelogram(double x, double y, double sideA, double sideB) {
        super(x, y);
        this.sideA = sideA;
        this.sideB = sideB;

    }

    @Override
    double getPerimeter() {
        return (2 * (sideA + sideB));

    }

    @Override
    double getArea() {
        return (sideA * sideB);
    }

    @Override
    public String getName() {
        return NAME;
    }
}

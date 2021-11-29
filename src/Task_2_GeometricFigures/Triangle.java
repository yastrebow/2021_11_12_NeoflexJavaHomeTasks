package Task_2_GeometricFigures;

public class Triangle extends GeometricFigures {
    private static final String NAME = "Triangle";
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double x, double y, double sideA, double sideB, double sideC) {
        super(x, y);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    double getPerimeter() {
        return (sideA + sideB + sideC);
    }

    @Override
    double getArea() {
        final double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public String getName() {
        return NAME;
    }
}
//    Разносторонний треугольник. По трём сторонам S = √(p·(p - a)·(p - b)·(p - c)), P = (a+b+c)/2
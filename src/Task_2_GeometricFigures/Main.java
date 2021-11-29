package Task_2_GeometricFigures;

public class Main {
    public static void main(String[] args) {

        GeometricFigures[] figure = {
                new Point(5, 6),
                new Line(5, 6, 11),
                new Circle(6, 7, 9),
                new Triangle(3, 4, 6, 6, 6),
                new Square(1, 2, 8),
                new Rectangle(10, 11, 8, 12),
                new Parallelogram(7, 8, 7, 8)
        };

        for(GeometricFigures fig : figure)
            System.out.println(fig.getName() + ": length = " + fig.getPerimeter() +  ", area = " + fig.getArea());
    }
}

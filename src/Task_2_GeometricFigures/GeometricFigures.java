package Task_2_GeometricFigures;

//2. Реализовать иерархию классов геометрических фигур в плоской системе координат –
//точка, прямая, окружность, треугольник, квадрат, прямоугольник, параллелограмм.
//Каждая сущность должна задаваться минимально необходимым количеством параметров и иметь методы,
//возвращающие её параметры – тип фигуры, длина линий, из которых она состоит (для точки константа 0,
//для прямой – длина, для окружности – длина окружности, для остальных периметр),
//площадь (для точки и прямой константа 0).
//Необходимо создать коллекцию (массив) разных фигур и в цикле вывести в консоль их параметры.

public abstract class GeometricFigures {
    public double x; //координата X
    public double y; //координата Y

    public GeometricFigures(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract String getName();

    abstract double getPerimeter();

    abstract double getArea();


}

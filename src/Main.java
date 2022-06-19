
public class Main {
    public static void main(String[] args) {
        Square square = new Square(4);
        square.squareResult();
        Rectangle rectangle = new Rectangle(5, 7);
        rectangle.squareResult();
        Triangle triangle = new Triangle(5, 4, 6);
        triangle.squareResult();
        System.out.println("-------Часть 2-------");
        System.out.println("Периметр квадрата равен: " + square.perimeter());
        System.out.println("Периметр прямоугольника равен: " + rectangle.perimeter());
        System.out.println("Периметр треугольника равен: " + triangle.perimeter());}
}

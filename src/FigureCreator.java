import java.util.Objects;
import java.util.Scanner;

public class FigureCreator {
    public Figures figureCreator() throws Exception {
        System.out.println("Введите желаемый тип фигуры для расчета. Доступные варианты: Rectangle, Triangle, Square, Circle");
        Scanner scanner = new Scanner(System.in);
        String figureType = scanner.nextLine();
        int sideAOrRadius;
        int sideB;
        int sideC;
        Figures figure = null;
        if (Objects.equals(figureType, "Rectangle")) {
            System.out.println("Поочередно введите значения двух сторон для прямоугольника");
            sideAOrRadius = scanner.nextInt();
            sideB = scanner.nextInt();
            figure = new Rectangle(sideAOrRadius, sideB);
        } else if (Objects.equals(figureType, "Triangle")) {
            System.out.println("Поочередно введите значения трех сторон для треугольника");
            sideAOrRadius = scanner.nextInt();
            sideB = scanner.nextInt();
            sideC = scanner.nextInt();
            figure = new Triangle(sideAOrRadius, sideB, sideC);
        } else if (Objects.equals(figureType, "Square")) {
            System.out.println("Введите значения для стороны квадрата");
            sideAOrRadius = scanner.nextInt();
            figure = new Square(sideAOrRadius);
        } else if (Objects.equals(figureType, "Circle")) {
            System.out.println("Введите значения радиуса для круга");
            sideAOrRadius = scanner.nextInt();
            figure = new Circle(sideAOrRadius);
        } else {
            throw new Exception("Введенный тип фигуры некорректен");
        }
        return figure;
    }
}

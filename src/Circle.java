public class Circle extends Figures{
    public Circle(int radius) {
        super(radius);
        this.setFigureType("Circle");
    }

    @Override
    public double perimeter() {
        return (getSideAOrRadius() * 2 * Math.PI);
    }

}

public class Rectangle extends Figures {
    public Rectangle(int sideA, int sideB) {
        super(sideA, sideB);
        this.setFigureType("Rectangle");
    }

    @Override
    public double perimeter() {
        return ((getSideAOrRadius() + getSideB()) * 2);
    }

}

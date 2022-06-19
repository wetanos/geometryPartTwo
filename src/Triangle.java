public class Triangle extends Figures{
    public Triangle(int sideA, int sideB, int sideC) {
        super(sideA, sideB, sideC);
        this.setFigureType("Triangle");
    }

    @Override
    public double perimeter() {
        return (getSideAOrRadius() + getSideB() + getSideC());
    }
}

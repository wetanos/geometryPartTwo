public class Triangle extends Figures{
    public Triangle(int sideA, int sideB, int sideC) {
        super(sideA, sideB, sideC);
        this.setFigureType("Triangle");
    }

    @Override
    public int perimeter() {
        return (getSideA() + getSideB() + getSideC());
    }
}

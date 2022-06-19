public class Square extends Figures {

    public Square(int sideA) {
        super(sideA);
        this.setFigureType("Square");
    }

    @Override
    public double perimeter() {
        return (getSideAOrRadius() * 4);
    }
}

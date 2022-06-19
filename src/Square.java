public class Square extends Figures {

    public Square(int sideA) {
        super(sideA);
        this.setFigureType("Square");
    }

    @Override
    public int perimeter() {
        return (getSideA() * 4);
    }
}

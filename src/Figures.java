public abstract class Figures implements Computable {
    private int sideAOrRadius;
    private int sideB;
    private int sideC;
    private String figureType;

    public Figures(int sideA) {
        this.sideAOrRadius = sideA;
    }

    public Figures(int sideA, int sideB) {
        this.sideAOrRadius = sideA;
        this.sideB = sideB;
    }
    public Figures(int sideA, int sideB, int sideC) {
        this.sideAOrRadius = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideAOrRadius() {
        return sideAOrRadius;
    }

    public void setSideAOrRadius(int sideAOrRadius) {
        this.sideAOrRadius = sideAOrRadius;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public String getFigureType() {
        return figureType;
    }

    public void setFigureType(String figureType) {
        this.figureType = figureType;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    @Override
    public void squareResult() {
        Computable.super.squareResult(sideAOrRadius, sideB, sideC, figureType);
    }

    public abstract double perimeter();
}

public abstract class Figures implements Computable {
    private int sideA;
    private int sideB;
    private int sideC;
    private String figureType;

    public Figures(int sideA) {
        this.sideA = sideA;
    }

    public Figures(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public Figures(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
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
        Computable.super.squareResult(sideA, sideB, sideC, figureType);
    }

    public abstract int perimeter();

}

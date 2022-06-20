
public class Main {
    public static void main(String[] args) throws Exception {
        FigureCreator figureCreator = new FigureCreator();
        Figures figureToTest = figureCreator.figureCreator();
        figureToTest.squareResult();
        System.out.println("-------Часть 2-------");
        System.out.println("Периметр " + figureToTest.getFigureType() + " равен: " + figureToTest.perimeter());
    }
}

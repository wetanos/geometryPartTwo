public interface Computable {

    default void squareResult(int sideAOrRadius, int sideB, int sideC, String figureType) {
        double result = 0;
        if (figureType == "Rectangle") {
            result = sideAOrRadius * sideB;
        } else if (figureType == "Triangle") {
            int p = (sideAOrRadius + sideB + sideC) / 2;
            result = Math.sqrt((p * (p-sideAOrRadius) * (p - sideB) * (p - sideC)));
        } else if (figureType == "Square") {
            result = Math.pow(sideAOrRadius, 2);
        } else if (figureType == "Circle") {
            result = (Math.pow(sideAOrRadius, 2) * Math.PI);
        }
        System.out.println("Площадь фигуры типа: \"" + figureType + "\" равна " + result);
    }
    void squareResult();
}

public interface Computable {

    default void squareResult(int sideA, int sideB, int sideC, String figureType) {
        double result = 0;
        if (figureType == "Rectangle") {
            result = sideA * sideB;
        } else if (figureType == "Triangle") {
            int p = (sideA + sideB + sideC) / 2;
            result = Math.sqrt((p * (p-sideA) * (p - sideB) * (p - sideC)));
        } else if (figureType == "Square") {
            result = Math.pow(sideA, 2);
        }
        System.out.println("Площадь фигуры типа: \"" + figureType + "\" равна " + result);
    }
    void squareResult();
}

package lesson08.Part1.Ex1;

/**
 * Класс, описывающий сущность Треугольник
 */

public class Triangle extends Figure{
    /** Стороны треугольника */
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    /** Площадь треугольника */
    @Override
    public float areaCalculating() {
        return (float) (Math.sqrt((sideA + sideB - sideC) *
                        (sideA - sideB + sideC) *
                        (-sideA + sideB + sideC) *
                        (sideA + sideB + sideC)) / 4);
    }

    /** Периметр треугольника */
    @Override
    public float perimeterCalculating() {
        return sideA + sideB + sideC;
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

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }
}

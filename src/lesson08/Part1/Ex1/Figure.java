package lesson08.Part1.Ex1;

/**
 * Класс, описывающий сущность Фигура. Родительский для Круга, Праямоугольника и Треугольника
 */

public class Figure {
    /** Площадь фигуры */
    private float area;
    /** Периметр фигуры */
    private int perimeter;

    public Figure() {
    }

    public float areaCalculating () {
        return area;
    }

    public float perimeterCalculating () {
        return perimeter;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }
}

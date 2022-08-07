package lesson08.Part1.Ex1;

/**
 * Класс, описывающий сущность Прямоугольник
 */

public class Rectangle extends Figure {
    /** Высота прямоугольника */
    private int height;
    /** Ширина прямоугольника */
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    /** Площадь прямоугольника */
    @Override
    public float areaCalculating() {
        return this.width * this.height;
    }

    /** Периметр прямоугольника */
    @Override
    public float perimeterCalculating() {
        return this.width * 2 + this.height * 2;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

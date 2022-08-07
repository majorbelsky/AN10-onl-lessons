package lesson08.Part1.Ex1;

/**
 * Класс, описывающий сущность Круг
 */

public class Circle extends Figure {
    /** Радиус круга */
    private int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    /** Площать Круга */
    @Override
    public float areaCalculating() {
        return (float) (Math.PI * radius * radius);
    }
    /** Длина окружности (периметр) */
    @Override
    public float perimeterCalculating() {
        return (float) (Math.PI * 2 * radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

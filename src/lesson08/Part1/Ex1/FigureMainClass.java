package lesson08.Part1.Ex1;

/**
 * Написать иерархию классов «Фигуры».
 * Фигура -> Треугольник -> Прямоугольник -> Круг.
 * Реализовать функцию подсчета площади для каждого типа фигуры и подсчет периметра.
 * Создать массив из 5 фигур.
 * Вывести на экран сумму периметра всех фигур в массиве.
 */

public class FigureMainClass {
    public static void main(String[] args) {

        /** Массив фигур */
        Figure[] figures  = {
                new Rectangle(2,3),
                new Circle(5),
                new Triangle(3,4,5),
                new Rectangle(4,5),
                new Circle(4)
        };

        /** Сумма периметра фигур из массива */
        float perimetersSum = 0;
        for (int i = 0; i < figures.length; i++) {
            perimetersSum += figures[i].perimeterCalculating();
        }

        System.out.println("Sum of perimeters: " + perimetersSum);
    }
}

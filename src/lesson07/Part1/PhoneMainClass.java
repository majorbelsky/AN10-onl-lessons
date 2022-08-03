package lesson07.Part1;

        /*
        Класс Phone.
        Создайте класс Phone, который содержит переменные number, model и weight. Создайте три экземпляра этого
        класса. Выведите на консоль значения их переменных.
        Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль
        сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать эти методы для каждого из
        объектов.
        Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации
        переменных класса - number, model и weight.
        Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса -
        number, model.
        Добавить конструктор без параметров.
        Вызвать из конструктора с тремя параметрами конструктор с двумя.
        Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер
        телефона звонящего.
        Вызвать этот метод.
        Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера
        телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
         */

public class PhoneMainClass {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        phone1.setNumber(321);
        phone1.setWeight(210);
        phone1.setModel("iPhone");

        phone2.setNumber(123);
        phone2.setWeight(150);
        phone2.setModel("Xiaomi");

        phone3.setNumber(213);
        phone3.setWeight(190);
        phone3.setModel("Samsung");

        System.out.println("Model: " + phone1.getModel()
                + "\nNumber: " + phone1.getNumber()
                + "\nWeight: " + phone1.getWeight());
        System.out.println("Model: " + phone2.getModel()
                + "\nNumber: " + phone2.getNumber()
                + "\nWeight: " + phone2.getWeight());
        System.out.println("Model: " + phone3.getModel()
                + "\nNumber: " + phone3.getNumber()
                + "\nWeight: " + phone3.getWeight());

        phone1.receiveCall("Vasily");
        phone2.receiveCall("Ivan");
        phone3.receiveCall("Artem");

        phone1.receiveCall("Denis",231);
        phone1.sendMessage(123,456,678,355);
    }
}

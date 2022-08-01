package lesson06.Part1;

import static lesson06.Part1.CreditCard.*;

public class CreditCardMainClass {
    public static void main(String[] args) {



        /*
        1. Создать класс CreditCard c полями номер счета, текущая сумма на счету.
           Добавьте метод, который позволяет начислять сумму на кредитную карточку.
           Добавьте метод, который позволяет снимать с карточки некоторую сумму.
           Добавьте метод, который выводит текущую информацию о карточке.
           Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер
           счета и начальная сумма
           Тестовый сценарий для проверки:
           Положите деньги на первые две карточки и снимите с третьей.
        */

        CreditCard card1 = new CreditCard(123, 500);
        CreditCard card2 = new CreditCard(321, 0);
        CreditCard card3 = new CreditCard(213, 300);

        System.out.println("----------------------------------------------");
        card1.printCardSum();
        card2.printCardSum();
        card3.printCardSum();

        card1.addSum(200);
        card2.addSum(300);
        card3.withdrawSum(500);

        System.out.println("----------------------------------------------");
        card1.printCardSum();
        card2.printCardSum();
        card3.printCardSum();

    }
}

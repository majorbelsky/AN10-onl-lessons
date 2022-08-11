package lesson08.Part2;

/**
 * Создать систему для учета документов.
 * Создать класс Регистр, который будет иметь методы:
 * - сохранения документа в регистре
 * - предоставление информации о документе
 * Система может работать с тремя типами документов:
 * 1) Контракт на поставку товаров
 * Содержит поля:
 * - Номер документа
 * - Тип товаров
 * - Количество товаров
 * - Дата документа
 * 2) Контракт с сотрудником
 * Содержит поля:
 * - Номер документа
 * - Дата документа
 * - Дата документа
 * - Дата окончания контракта
 * - Имя сотрудника
 * Автор: Полозов Артем
 * 3) Финансовая накладная
 * Содержит поля:
 * - Итоговая сумма за месяц
 * - Дата документа
 * - Номер документа
 * - Код департамента
 * - Класс регистр должен содержать внутри себя массив и при добавлении документа в регистр этот
 * добавляемый документ должен добавляться в массив;
 * - Массив для класса регистра должен быть размером 10;
 * - Для полей "Дата документа" следует использовать тип данных Date;
 * - В методе предоставления информации о документе следует выводить на экран информацию о
 * переданном входным параметром документе;
 * - Каждый класс для описания документов должен содержать конструктор с параметрами и без;
 * - Для имитации работы системы создайте класс Main, который будет содержать только один метод
 * public static void main
 * В этом методе напишите код для создания каждого из типов документов, добавления их в регистр и
 * вывода информации о документе;
 * - Все классы разместить по пакетам;
 * - При выполнении задания использовать понятия интерфейсов и абстрактных классов.
 */

import lesson08.Part2.Document.Document;
import lesson08.Part2.Document.EmployeeContract;
import lesson08.Part2.Document.FinancialInvoice;
import lesson08.Part2.Document.SupplyContract;
import lesson08.Part2.Register.Register;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        Register register = new Register();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Document contract1 = new EmployeeContract(123, new Date(), dateFormat.parse("05-11-2027"), "Vasily");
        register.saveDocumentToRegister(contract1);

        Document invoice1 = new FinancialInvoice(231, new Date(), 500000, 7);
        register.saveDocumentToRegister(invoice1);

        Document supply1 = new SupplyContract(321, new Date(), "Technics", 100);
        register.saveDocumentToRegister(supply1);

        register.printDocumentInfo(0);
        register.printDocumentInfo(1);
        register.printDocumentInfo(2);
    }
}

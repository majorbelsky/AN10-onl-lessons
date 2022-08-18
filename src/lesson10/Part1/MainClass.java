package lesson10.Part1;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Input document nuber in format xxxx-yyy-xxxx-yyy-xyxy:");
        Scanner scanner = new Scanner(System.in);
        String documentNumber = scanner.nextLine();
        System.out.println(documentNumber);

        /** Вывести на экран в одну строку два первых блока по 4 цифры */
        System.out.println(Document.getTwoNumberBlocks(documentNumber));

        /** Вывести на экран номер домкумента, но блоки из трех букв заменить на *** */
        System.out.println(Document.replaceLetterBlock(documentNumber, "***"));

        /** Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре */
        System.out.println(Document.getLettersLowerCase(documentNumber));

        /** Вывести на экран только одни буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем
         * регистре(реализовать с помощью класса StringBuild) */
        System.out.println(Document.getLettersUpperCase(documentNumber));

        /** Проверить содержит ли номер документа последовательность abc */
        try {
            Document.containsIgnoreCase(documentNumber, "abc");
            System.out.println("Document \"" + documentNumber + "\" contains \"abc\"");
        } catch (ContainsException e) {
            e.printStackTrace();
        }

        /** Проверить начинается ли номер документа с последовательности 555 */
        try {
            Document.startsWith(documentNumber, "555");
            System.out.println("Document \"" + documentNumber + "\" start with \"555\""
            );
        } catch (StartWithException e) {
            e.printStackTrace();
        }

        /** Проверить заканчивается ли номер документа с последовательности 1a2b */
        try {
            Document.endsWith(documentNumber, "1a2b");
            System.out.println("Document \"" + documentNumber + "\" end with \"1a2b\""
            );
        } catch (EndWithException e) {
            e.printStackTrace();
        }
    }
}
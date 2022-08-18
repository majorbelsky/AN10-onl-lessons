package lesson10.Part2;

public class StringMainClass {
    public static void main(String[] args) {
         /**
        1. Дана строка произвольной длины с произвольными словами.
        Найти самое короткое слово в строке и вывести его на экран.
        Найти самое длинное слово в строке и вывести его на экран.
         */
        String testString = "Test string for String Methods in Java";
        System.out.println(StringMethods.findShortestWord(testString));
        System.out.println(StringMethods.findLongestWord(testString));
        /**
        2.  Дана строка произвольной длины с произвольными словами.
        Найти слово, в котором число различных символов минимально.
        Слово может содержать буквы и цифры. Если таких слов несколько, найти первое из них. Например,
        в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".
         */
        System.out.println(StringMethods.findWordWithMinDifferentChars("fffff ab f 1234 jkjk"));

        /**
        3. Дана строка произвольной длины с произвольными словами.
        Написать программу для проверки является ли любое выбранное слово в строке палиндромом.
        Например, есть строка, вводится число 3, значит необходимо проверить является ли 3 Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций: например, в строке 5 слов, а на вход программе передали число 500 и т. п. ситуации.
         */
        System.out.println(StringMethods.checkIsPalindromeWord("Level up", 0));

        /**
         4. Дана произвольная строка. Вынести на консоль новую строку, в которой задублирована
         каждая буква из начальной строки.
         */
        System.out.println(StringMethods.duplicateLetters("Hello"));
    }
}

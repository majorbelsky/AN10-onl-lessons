package lesson10.Part2;

public class StringMethods {

    /** Находит самое короткое слово в предложении */
    public static String findShortestWord(String str) {
        String[] words = str.trim().split(" ");
        int length = words[0].length();
        int index = 0;

        for (int i = 1; i < words.length; i++) {
            int wordLength = words[i].length();
            if (wordLength <= length) {
                length = wordLength;
                index = i;
            }
        }

        return words[index];
    }

    /** Находит самое длинное слово в предложении */
    public static String findLongestWord(String str) {
        String[] words = str.trim().split(" ");
        int length = words[0].length();
        int index = 0;

        for (int i = 1; i < words.length; i++) {
            int wordLength = words[i].length();
            if (wordLength >= length) {
                length = wordLength;
                index = i;
            }
        }

        return words[index];
    }

    /** Находит слово в предложении с минимальным количеством различных символов */
    public static String findWordWithMinDifferentChars(String str) {
        String[] words = str.trim().split(" ");
        int indexOfResultWord = 0;
        int minCount = words[0].length();

        for (int i = 0; i < words.length; i++) {
            char symbol = words[i].charAt(0);
            int tmpMinCount = 0;

            for (int j = 1; j < words[i].length(); j++) {
                char tmpSymbol = words[i].charAt(j);
                if (tmpSymbol != symbol) {
                    tmpMinCount++;
                }
            }

            if (tmpMinCount < minCount) {
                minCount = tmpMinCount;
                indexOfResultWord = i;
            }
        }

        return words[indexOfResultWord];
    }

    /** Проверяет является ли слово по индексу в предложении палиндромом */
    public static boolean checkIsPalindromeWord(String str, int wordIndex) {
        String[] words = str.trim().split(" ");
        if (wordIndex >= words.length) {
            System.out.println("You give index that is out of string");
            return false;
        }
        return isPalindrome(words[wordIndex].toLowerCase());
    }

    /** Дублирует каждую букву в строке */
    public static String duplicateLetters(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            stringBuilder
                    .append(symbol)
                    .append(symbol);
        }
        return stringBuilder.toString();
    }

    /** Проверка является ли слово палиндромом */
    private static boolean isPalindrome(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            stringBuilder.append(word.charAt(i));
        }
        return word.equals(stringBuilder.toString());
    }
}

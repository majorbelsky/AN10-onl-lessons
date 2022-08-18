package lesson10.Part1;

public abstract class Document {

    public static String getTwoNumberBlocks(String documentNumber) {
        String[] stringArr = documentNumber.split("-");
        return stringArr[0] + stringArr[2];
    }

    public static String replaceLetterBlock(String documentNumber, String string) {
        return documentNumber.replaceAll("[a-zA-Z]{3}", string);
    }

    public static String getLettersLowerCase(String documentNumber) {
        return documentNumber.replaceAll("[0-9]{4}", "").replaceAll("[0-9]", "-").replaceAll("-+", "/").replaceFirst("/", "").toLowerCase();
    }

    public static String getLettersUpperCase(String documentNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] stringArr = documentNumber.split("-");

        for (String el : stringArr) {
            if (el.matches("^[a-zA-Z]{3}$")) {
                stringBuilder.append(el).append("/");
            } else if (el.matches("[a-zA-Z0-9]+")) {
                for (int j = 0; j < el.length(); j++) {
                    if (Character.isLetter(el.charAt(j))) {
                        stringBuilder.append(el.charAt(j)).append("/");
                    }
                }
            }
        }

        return stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString().toUpperCase();
    }

    public static void containsIgnoreCase(String documentNumber, String string) throws ContainsException {
        if (!documentNumber.toLowerCase().contains(string.toLowerCase())) {
            throw new ContainsException("Document \"" + documentNumber + "\" doesn't contain \"" + string + "\"");
        }
    }

    public static void startsWith(String documentNumber, String string) throws StartWithException {
        if (!documentNumber.startsWith(string)) {
            throw new StartWithException("Document \"" + documentNumber + "\" doesn't start \"" + string + "\"");
        }
    }

    public static void endsWith(String documentNumber, String string) throws EndWithException {
        if (!documentNumber.endsWith(string)) {
            throw new EndWithException("Document \"" + documentNumber + "\" doesn't end \"" + string + "\"");
        }
    }
}

package lesson10.Part3;

public abstract class Authorisation {
    private static final int FIELD_MAX_LENGTH = 20;
    private static final char FIELD_EXCLUDE_SYMBOL = ' ';

    public static void login(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!checkField(login)) {
            throw new WrongLoginException("Wrong login");
        }

        if (!checkPassword(password, confirmPassword)) {
            throw new WrongPasswordException("Wrong password");
        }
    }

    private static boolean checkField(String login) {
        int length = login.length();
        return length > 0 && length < FIELD_MAX_LENGTH && login.indexOf(FIELD_EXCLUDE_SYMBOL) == -1;
    }

    private static boolean checkPassword(String password, String confirmPassword) {
        return checkField(password)
                && password.matches(".*\\d.*")
                && password.equals(confirmPassword);
    }
}

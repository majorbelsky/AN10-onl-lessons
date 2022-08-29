package lesson14.Part1;

public enum Phrase {
    PHRASE1 ("Hello! "),
    PHRASE2 ("How are you? "),
    PHRASE3 ("What are you doing?");

    private final String phrase;

    Phrase(String phrase) {
        this.phrase = phrase;
    }

    public String toString() {
        return phrase;
    }
}

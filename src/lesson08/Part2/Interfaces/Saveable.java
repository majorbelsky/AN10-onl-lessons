package lesson08.Part2.Interfaces;

import lesson08.Part2.Document.Document;

/**
 * Интерфейс сохранения документа
 */

public interface Saveable {
    void saveDocumentToRegister(Document document);
}

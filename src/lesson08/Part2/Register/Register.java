package lesson08.Part2.Register;

import lesson08.Part2.Document.Document;
import lesson08.Part2.Interfaces.Saveable;

/**
 * Класс, описывающий сущность Реестр
 */

public class Register implements Saveable {

    /** Массив регистра */
    private Document[] registerArray;

    public Register() {
        this.registerArray = new Document[10];
    }

    /** Предоставление информации о документе по индексу в массиве */
    public void printDocumentInfo(int arrayIndex) {
        this.registerArray[arrayIndex].printDocumentInfo();
        System.out.println("-----------------------------------------");
    }

    /** Сохранение документа в регистре */
    @Override
    public void saveDocumentToRegister(Document document) {
        for (int i = 0; i < registerArray.length; i++) {
            if (registerArray[i] == null) {
                registerArray[i] = document;
                break;
            }
        }
    }
}

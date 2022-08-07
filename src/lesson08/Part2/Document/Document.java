package lesson08.Part2.Document;

/**
 * Абстрактный класс, описывающий сущность Документ
 */

import java.util.Date;

public abstract class Document {
    /** Номер документа */
    private int documentNumber;
    /** Дата документа */
    private Date documentDate;

    public Document() {
    }

    public Document(int documentNumber, Date documentDate) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Date getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(Date documentDate) {
        this.documentDate = documentDate;
    }

    public abstract void printDocumentInfo();
}

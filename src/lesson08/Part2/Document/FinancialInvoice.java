package lesson08.Part2.Document;

/**
 * Класс, описывающий сущность Финансовая накладная
 */

import lesson08.Part2.Interfaces.Printable;

import java.util.Date;

public class FinancialInvoice extends Document implements Printable {
    /** Итоговая сумма за месяц */
    private int monthSum;
    /** Код департамента */
    private int departmentCode;

    public FinancialInvoice() {
    }

    public FinancialInvoice(int documentNumber, Date documentDate, int monthSum, int departmentCode) {
        super(documentNumber, documentDate);
        this.monthSum = monthSum;
        this.departmentCode = departmentCode;
    }

    /** Предоставление информации о накладной */
    @Override
    public void printDocumentInfo() {
        System.out.printf("""
                        Number of document: %d
                        Date: %td.%tm.%ty
                        Monthly total: %d
                        Department code: %d
                        """,
                this.getDocumentNumber(),
                this.getDocumentDate(),
                this.getDocumentDate(),
                this.getDocumentDate(),
                this.monthSum,
                this.departmentCode);
    }
}

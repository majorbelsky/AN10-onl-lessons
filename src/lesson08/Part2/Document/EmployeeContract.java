package lesson08.Part2.Document;

/**
 * Класс, описывающий сущность Контракт с сотрудником
 */

import lesson08.Part2.Interfaces.Printable;

import java.util.Date;

public class EmployeeContract extends Document implements Printable {
    /** Дата окончания  контракта */
    private Date endOfContractDate;
    /** Имя сотрудника */
    private String employeeName;

    public EmployeeContract() {
    }

    public EmployeeContract(int documentNumber, Date documentDate, Date endOfContractDate, String employeeName) {
        super(documentNumber, documentDate);
        this.endOfContractDate = endOfContractDate;
        this.employeeName = employeeName;
    }

    /** Предоставление информации о контракте */
    @Override
    public void printDocumentInfo() {
        System.out.printf("""
                        Number of document: %d
                        Date: %td.%tm.%ty
                        Contract end date:  %td.%tm.%ty
                        Employee name: %s
                        """,
                this.getDocumentNumber(),
                this.getDocumentDate(),
                this.getDocumentDate(),
                this.getDocumentDate(),
                this.endOfContractDate,
                this.endOfContractDate,
                this.endOfContractDate,
                this.employeeName);
    }



    @Override
    public int getDocumentNumber() {
        return super.getDocumentNumber();
    }

    @Override
    public void setDocumentNumber(int documentNumber) {
        super.setDocumentNumber(documentNumber);
    }

    @Override
    public Date getDocumentDate() {
        return super.getDocumentDate();
    }

    @Override
    public void setDocumentDate(Date documentDate) {
        super.setDocumentDate(documentDate);
    }

    public Date getEndOfContractDate() {
        return endOfContractDate;
    }

    public void setEndOfContractDate(Date endOfContractDate) {
        this.endOfContractDate = endOfContractDate;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}

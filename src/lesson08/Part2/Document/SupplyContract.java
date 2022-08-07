package lesson08.Part2.Document;

/**
 * Класс, описывающий сущность Контракт на поставку товаров
 */

import lesson08.Part2.Interfaces.Printable;

import java.util.Date;

public class SupplyContract extends Document implements Printable {
    /** Тип товаров */
    private String typeOfGoods;
    /** Количество товаров */
    private int goodsQuantity;

    public SupplyContract() {
    }

    public SupplyContract(int documentNumber, Date documentDate, String typeOfGoods, int goodsQuantity) {
        super(documentNumber, documentDate);
        this.typeOfGoods = typeOfGoods;
        this.goodsQuantity = goodsQuantity;
    }

    /** Предоставление информации о контракте */
    @Override
    public void printDocumentInfo() {
        System.out.printf("""
                        Number of document: %d
                        Date: %td.%tm.%ty
                        Type of goods: %s
                        Goods quantity: %d
                        """,
                this.getDocumentNumber(),
                this.getDocumentDate(),
                this.getDocumentDate(),
                this.getDocumentDate(),
                this.typeOfGoods,
                this.goodsQuantity);
    }
}

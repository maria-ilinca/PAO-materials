package models;

import java.util.Date;

public class Client extends Person{
    private Date purchaseDate;
    private Integer purchaseValue;

    public Client(String name, Integer id, String cnp, Date purchaseDate, Integer purchaseValue) {
        super(name, id, cnp);
        this.purchaseDate = purchaseDate;
        this.purchaseValue = purchaseValue;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public Integer getPurchaseValue() {
        return purchaseValue;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setPurchaseValue(Integer purchaseValue) {
        this.purchaseValue = purchaseValue;
    }

    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", id=" + id + ", cnp=" + cnp + ", purchaseDate=" + purchaseDate + ", purchaseValue=" + purchaseValue + '}';
    }

}

package models;

import java.util.Date;

public class Drink extends Product{
    private String producer;

    private Date expirationDate;
    private int volume;
    private boolean isAlcoholic;

    public Drink(String name, Integer id, Integer price, Integer quantity, String producer, Date expirationDate, int volume, boolean isAlcoholic) {
        super(name, id, price, quantity);
        this.producer = producer;
        this.expirationDate = expirationDate;
        this.volume = volume;
        this.isAlcoholic = isAlcoholic;
    }

    public String getProducer() {
        return producer;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public int getVolume() {
        return volume;
    }

    public boolean getIsAlcoholic() {
        return isAlcoholic;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setIsAlcoholic(boolean isAlcoholic) {
        this.isAlcoholic = isAlcoholic;
    }

    @Override
    public String toString() {
        return "Drink{" + "name=" + name + ", id=" + id + ", price=" + price + ", quantity=" + quantity + ", producer=" + producer + ", expirationDate=" + expirationDate + ", volume=" + volume + ", isAlcoholic=" + isAlcoholic + '}';
    }
}

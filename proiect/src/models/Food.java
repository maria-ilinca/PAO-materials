package models;

import java.util.List;
import java.util.Date;

public class Food extends Product{

    private Date expirationDate;

    private Integer quantityfood;
    private String producer;
    private Integer calories;
    private List<String> ingredients;

    private boolean isVegetarian;
    private boolean isVegan;

    public Food(String name, Integer id, Integer price, Integer quantity, Date expirationDate, String producer, Integer quantityfood,Integer calories, List<String> ingredients, boolean isVegetarian, boolean isVegan) {
        super(name, id, price, quantity);
        this.expirationDate = expirationDate;
        this.quantityfood = quantityfood;
        this.producer = producer;
        this.calories = calories;
        this.ingredients = ingredients;
        this.isVegetarian = isVegetarian;
        this.isVegan = isVegan;
    }
    public Date getExpirationDate() {
        return expirationDate;
    }

    public Integer getQuantityfood() {return quantityfood;}

    public String getProducer() {
        return producer;
    }

    public int getCalories() {
        return calories;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public boolean getIsVegetarian() {
        return isVegetarian;
    }

    public boolean getIsVegan() {
        return isVegan;
    }


    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public void setIsVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }

    public void setIsVegan(boolean isVegan) {
        this.isVegan = isVegan;
    }

    public void setQuantityfood(Integer quantityfood) {
        this.quantityfood = quantityfood;
    }

    @Override
    public String toString() {
        return "Food{" + "name=" + name + ", id=" + id + ", price=" + price + ", quantity=" + quantity + ", expirationDate=" + expirationDate + ", producer=" + producer + ",cantitate de mancare = " + quantityfood +  ", calories=" + calories + ", ingredients=" + ingredients + ", isVegetarian=" + isVegetarian + ", isVegan=" + isVegan + '}';
    }
}

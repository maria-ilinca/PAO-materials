package models;

public class Flower extends Product{
    private String color;
    private String name;

    public Flower(String name, Integer id, Integer price, Integer quantity, String color) {
        super(name, id, price, quantity);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Flower{" + "name=" + name + ", id=" + id + ", price=" + price + ", quantity=" + quantity + ", color=" + color + '}';
    }
}

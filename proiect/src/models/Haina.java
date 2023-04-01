package models;

public class Haina extends Product{
    private String color;
    private String size;
    private String material;
    private String nume;

    public Haina(String name, Integer id, Integer price, Integer quantity, String color, String size, String material) {
        super(name, id, price, quantity);
        this.color = color;
        this.size = size;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Haina{" + "name=" + name + ", id=" + id + ", price=" + price + ", quantity=" + quantity + ", color=" + color + ", size=" + size + ", material=" + material + '}';
    }
}

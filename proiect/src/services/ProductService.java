package services;

import models.*;

import repository.ProductRepository;

public class ProductService {
    private ProductRepository products = new ProductRepository();
    public void addProduct(Product product) {
        products.addProduct(product);
    }

    public void removeProduct(int id) {
        products.removeProduct(id);
    }

    public void checkExpirationDate() {
        products.checkExpirationDate();
    }

    public void getProduct() {
        products.getProduct();
    }

    public void updateProductQuantity() {
        products.updateProductQuantity();
    }

    public void sortClothesBySize() {
        products.sortClothesBySize();
    }

    public void getCalories() {
        products.getCalories();
    }

    public void getAlcohol() {
        products.getAlcohol();
    }


}

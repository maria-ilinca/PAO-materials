package services;

import models.*;
import java.util.ArrayList;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ProductService {
    private ArrayList<Product> products = new ArrayList<>();

    // verifica daca un produs de tipul mancare e expirat
    public boolean isExpired(Map <Integer, Product> products) {
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            if (entry.getValue() instanceof models.Food) {
                models.Food f = (models.Food) entry.getValue();
                Date currentDate = new Date();
                if (f.getExpirationDate().before(currentDate)) {
                    return true;
                }
            }
        }
        return false;
    }

    // sorteaza produsele de tip haina dupa marime
    public Map<String, ArrayList<Product>> sortBySize(Map <Integer, Product> products) {
        Map<String, ArrayList<Product>> mapHaine = new HashMap<>();
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            if (entry.getValue() instanceof models.Haina) {
                models.Haina c = (models.Haina) entry.getValue();
                if (mapHaine.containsKey(c.getSize())) {
                    mapHaine.get(c.getSize()).add(c);
                } else {
                    ArrayList<Product> list = new ArrayList<>();
                    list.add(c);
                    mapHaine.put(c.getSize(), list);
                }
            }
        }
        return mapHaine;
    }

    // adauga un produs in lista de produse
    public void addProduct(int id,Product p) {
        products.add(id, p);
    }

    // sterge un produs din lista de produse
    public void removeProduct(int id) {
        products.remove(id);
    }

    public void getProduct(int id) {
        products.get(id);
    }

// returneaza caloriile de la toate produsele de tip mancare

    public Map<Integer, Food> getCalories(Map <Integer, Product> products) {
        Map<Integer, Food> mapCalories = new HashMap<>();
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            if (entry.getValue() instanceof models.Food) {
                models.Food f = (models.Food) entry.getValue();
                mapCalories.put(entry.getKey(), f);
            }
        }
        return mapCalories;
    }

    // returneaza toate bauturile alcoolice
    public ArrayList<Drink> getAlcohol(Map <Integer, Product> products) {
        ArrayList<Drink> listAlcohol = new ArrayList<>();
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            if (entry.getValue() instanceof models.Drink) {
                models.Drink d = (models.Drink) entry.getValue();
                if (d.getIsAlcoholic()) {
                    listAlcohol.add(d);
                }
            }
        }
        return listAlcohol;
    }
}

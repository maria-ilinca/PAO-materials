package services;

import models.Angajat;
import models.Client;
import models.Shop;

import java.util.Map;

public class ShopService {
    private AngajatService angajatService;
    private ClientService clientService;

    private ProductService productService;

    Map <Integer, Shop> magazine;

    public ShopService() {
        angajatService = new AngajatService();
        clientService = new ClientService();
    }

    public void addShop(int id, Shop shop) {
        magazine.put(id, shop);
    }

    public void removeShop(int id) {
        magazine.remove(id);
    }

    public Shop getShop(int id) {
        return magazine.get(id);
    }

    public void getAllShops() {
        // afiseaza toate magazinele
        for (Map.Entry<Integer, Shop> entry : magazine.entrySet()) {
            System.out.println(entry.getValue());
        }
    }


}

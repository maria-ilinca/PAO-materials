package services;

import models.Angajat;
import models.Client;
import models.Shop;

import repository.ShopRepository;

public class ShopService {
   private ShopRepository shops = new ShopRepository();
        public void addShop(Shop shop) {
            shops.addShop(shop);
        }

        public void removeShop(int id) {
            shops.removeShop(id);
        }

        public void updateShopAddress() {
            shops.updateShopAddress();
        }

        public void getShop(int id) {
            shops.getShop(id);
        }

        public void getAllShops() {
            shops.getAllShops();
        }


}

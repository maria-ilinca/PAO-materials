package services;

import models.Angajat;
import models.Client;
import models.Shop;

import repository.ShopRepository;

public class ShopService {
   private ShopRepository shopRepository= new ShopRepository();
        public void addShop(Shop shop) {
            shopRepository.addShop(shop);
        }

        public void removeShop(int id) {
            shopRepository.removeShop(id);
        }

        public void updateShopAddress() {
            shopRepository.updateShopAddress();
        }

        public void getShop(int id) {
            shopRepository.getShop(id);
        }

        public void getAllShops() {
            shopRepository.getAllShops();
        }


}

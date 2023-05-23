package repository;

import config.DBConnection;
import models.Shop;
import services.AuditService;

import java.sql.Date;
import java.sql.PreparedStatement;

public class ShopRepository {
    AuditService auditService = new AuditService();
    public void getShop (int id) {
        String sql = "SELECT * FROM shops";
        try (PreparedStatement statement = DBConnection.getInstance().prepareStatement(sql)) {
            var result = statement.executeQuery();
            while (result.next()) {
                System.out.println("Id: " + result.getInt("id") + " Nume: " + result.getString("nume") + " Adresa: " + result.getString("adresa"));
            }
            auditService.addAction("getShop");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void addShop(Shop shop) {
        String sql = "INSERT INTO shop VALUES (NULL,?, ?)";
        try (PreparedStatement statement = DBConnection.getInstance().prepareStatement(sql)) {
            statement.setString(1, shop.getName());
            statement.setString(2, shop.getAddress());
            statement.executeUpdate();
            System.out.println("Magazinul a fost adaugat cu succes!");
            auditService.addAction("addShop");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void removeShop(int id) {
        String sql = "DELETE FROM shop WHERE id = ?";
        try (PreparedStatement statement = DBConnection.getInstance().prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
            System.out.println("Magazinul a fost sters cu succes!");
            auditService.addAction("removeShop");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateShopAddress() {
        // pentru magazinele cu adresa care incepe cu litera 'B' se va actualiza adresa cu 'Bucuresti'
        String sql = "UPDATE shop SET adresa = 'Bucuresti' WHERE adresa LIKE 'B%'";
        try (PreparedStatement statement = DBConnection.getInstance().prepareStatement(sql)) {
            statement.executeUpdate();
            System.out.println("Adresa magazinelor a fost actualizata cu succes!");
            auditService.addAction("updateShopAddress");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //get all shops
    public void getAllShops() {
        String sql = "SELECT * FROM shop";
        try (PreparedStatement statement = DBConnection.getInstance().prepareStatement(sql)) {
            var result = statement.executeQuery();
            while (result.next()) {
                System.out.println("Id: " + result.getInt("id") + " Nume: " + result.getString("nume") + " Adresa: " + result.getString("adresa"));
            }
            auditService.addAction("getAllShops");
        } catch (Exception e) {
            System.out.println("Ma che cazzo fai?" + e.getMessage());
        }

    }
}

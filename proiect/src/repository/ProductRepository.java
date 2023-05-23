package repository;

import config.DBConnection;
import models.Product;
import services.AuditService;

import java.sql.Date;
import java.sql.PreparedStatement;
public class ProductRepository {
    AuditService auditService = new AuditService();

    public void getProduct() {
        String sql = "SELECT * FROM product";
        try (PreparedStatement statement = DBConnection.getInstance().prepareStatement(sql)) {
            var result = statement.executeQuery();
            while (result.next()) {
                System.out.println("Id: " + result.getInt("id") + " Nume: " + result.getString("nume") + " Pret: " + result.getInt("pret") + " Cantitate: " + result.getInt("cantitate"));
            }
            auditService.addAction("getProduct");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void addProduct(Product product) {
        String sql = "INSERT INTO product VALUES (NULL,?, ?, ?)";
        try (PreparedStatement statement = DBConnection.getInstance().prepareStatement(sql)) {
            statement.setString(1, product.getName());
            statement.setInt(2, product.getPrice());
            statement.setInt(3, product.getQuantity());
            statement.executeUpdate();
            System.out.println("Produsul a fost adaugat cu succes!");
            auditService.addAction("addProduct");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void removeProduct(int id) {
        String sql = "DELETE FROM product WHERE id = ?";
        try (PreparedStatement statement = DBConnection.getInstance().prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
            System.out.println("Produsul a fost sters cu succes!");
            auditService.addAction("removeProduct");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // verifica daca un produs de tipul mancare e expirat
    public void checkExpirationDate() {
        String sql = "SELECT * FROM product WHERE nume LIKE 'mancare' AND data_expirare < ?";
        try (PreparedStatement statement = DBConnection.getInstance().prepareStatement(sql)) {
            statement.setDate(1, Date.valueOf("2021-05-01"));
            var result = statement.executeQuery();
            while (result.next()) {
                System.out.println("Produsul " + result.getString("nume") + " cu id-ul " + result.getInt("id") + " este expirat!");
            }
            auditService.addAction("checkExpirationDate");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    // sorteaza produsele de tip haina dupa marime
    public void sortClothesBySize() {
        String sql = "SELECT * FROM product WHERE nume LIKE 'haina' ORDER BY marime";
        try (PreparedStatement statement = DBConnection.getInstance().prepareStatement(sql)) {
            var result = statement.executeQuery();
            while (result.next()) {
                System.out.println("Produsul " + result.getString("nume") + " cu id-ul " + result.getInt("id") + " are marimea " + result.getString("marime"));
            }
            auditService.addAction("sortClothesBySize");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // returneaza caloriile de la toate produsele de tip mancare
    public void getCalories() {
        String sql = "SELECT * FROM product WHERE nume LIKE 'mancare'";
        try (PreparedStatement statement = DBConnection.getInstance().prepareStatement(sql)) {
            var result = statement.executeQuery();
            while (result.next()) {
                System.out.println("Produsul " + result.getString("nume") + " cu id-ul " + result.getInt("id") + " are " + result.getInt("calorii") + " calorii");
            }
            auditService.addAction("getCalories");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // returneaza toate bauturile alcoolice
    public void getAlcohol() {
        String sql = "SELECT * FROM product WHERE nume LIKE 'bautura' AND alcoolic = 1";
        try (PreparedStatement statement = DBConnection.getInstance().prepareStatement(sql)) {
            var result = statement.executeQuery();
            while (result.next()) {
                System.out.println("Produsul " + result.getString("nume") + " cu id-ul " + result.getInt("id") + " este alcoolic");
            }
            auditService.addAction("getAlcohol");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

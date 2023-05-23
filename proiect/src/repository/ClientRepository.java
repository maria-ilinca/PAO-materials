package repository;

import config.DBConnection;
import models.Client;
import services.AuditService;

import java.sql.Date;
import java.sql.PreparedStatement;

public class ClientRepository {
    AuditService auditService = new AuditService();
    public void getClient() {
        String sql = "SELECT * FROM client";
        try (PreparedStatement statement = DBConnection.getInstance().prepareStatement(sql)) {
            var result = statement.executeQuery();
            while (result.next()) {
                System.out.println("Id: " + result.getInt("id") + " Nume: " + result.getString("nume") + " Prenume: " + result.getString("prenume") + " CNP: " + result.getString("cnp") + " Email: " + result.getString("email") + " Telefon: " + result.getString("telefon"));
            }
            auditService.addAction("getClient");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public void addClient(Client client) {
        String sql = "INSERT INTO client VALUES (NULL,?, ?, ?, ?)";
        try (PreparedStatement statement = DBConnection.getInstance().prepareStatement(sql)) {
            statement.setString(1, client.getName());
            statement.setString(2, client.getCnp());
            statement.setDate(3, (Date) client.getPurchaseDate());
            statement.setInt(4, client.getPurchaseValue());
            statement.executeUpdate();
            System.out.println("Clientul a fost adaugat cu succes!");
            auditService.addAction("addClient");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void removeClient(int id) {
        String sql = "DELETE FROM client WHERE id = ?";
        try (PreparedStatement statement = DBConnection.getInstance().prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
            System.out.println("Clientul a fost sters cu succes!");
            auditService.addAction("removeClient");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateClientPurchase()
    {
        // pentru clientii cu id par se va adauga la purchasevalue 100
        String sql = "UPDATE client SET purchaseValue=purchaseValue+100  WHERE id % 2 = 0";
        try (PreparedStatement statement = DBConnection.getInstance().prepareStatement(sql)) {
            statement.executeUpdate();
            System.out.println("Emailurile au fost actualizate cu succes!");
            auditService.addAction("updateClientEmail");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());}
    }

    // determina numele clientilor care au facut cumparaturi in ultima luna
    public void getClientLastMonth()
    {
        String sql = "SELECT nume FROM client WHERE purchaseDate > DATE_SUB(CURDATE(), INTERVAL 1 MONTH)";
        try (PreparedStatement statement = DBConnection.getInstance().prepareStatement(sql)) {
            var result = statement.executeQuery();
            while (result.next()) {
                System.out.println("Nume: " + result.getString("nume"));
            }
            auditService.addAction("getClientLastMonth");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

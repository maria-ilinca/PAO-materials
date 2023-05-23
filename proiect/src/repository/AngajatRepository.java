package repository;

import config.DBConnection;
import models.Angajat;
import services.AuditService;

import java.sql.Date;
import java.sql.PreparedStatement;

public class AngajatRepository {
     AuditService auditService = new AuditService();
     public void getAngajat() {
         String sql = "SELECT * FROM angajat";
         try (PreparedStatement statement = DBConnection.getInstance().prepareStatement(sql)) {
            var result = statement.executeQuery();
            while (result.next()) {
                System.out.println("Id: " + result.getInt("id") + " Nume: " + result.getString("nume") + " Prenume: " + result.getString("prenume") + " Salariu: " + result.getInt("salariu") + " Data angajarii: " + result.getDate("data_angajarii"));
            }
            auditService.addAction("getAngajat");
         }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }

     }
     public void addAngajat(Angajat angajat) {
         String sql = "INSERT INTO angajat VALUES (NULL,?,?,?,?,?)";
         try (PreparedStatement statement = DBConnection.getInstance().prepareStatement(sql)) {
             statement.setString(1, angajat.getName());
             statement.setString(2, angajat.getCnp());
             statement.setString(3, angajat.getJob());
             statement.setInt(4, angajat.getSalary());
             statement.setDate(5, (Date) angajat.getHireDate());
             statement.executeUpdate();
             System.out.println("Angajatul a fost adaugat cu succes!");
             auditService.addAction("addAngajat");
         }
         catch (Exception e) {
             System.out.println(e.getMessage());
         }
     }

     public void removeAngajat(int id) {
         String sql = "DELETE FROM angajat WHERE id = ?";
         try (PreparedStatement statement = DBConnection.getInstance().prepareStatement(sql)) {
             statement.setInt(1, id);
             statement.executeUpdate();
             System.out.println("Angajatul a fost sters cu succes!");
             auditService.addAction("removeAngajat");
         }
         catch (Exception e) {
             System.out.println(e.getMessage());
         }
     }

     public void updateAngajatSalary()
        {
            // pentru angajatii cu hiredate cu 5 ani in urma se va actualiza salariul cu 15%
            String sql = "UPDATE angajat SET salariu = salariu + salariu * 15 / 100 WHERE data_angajarii < DATE_SUB(CURDATE(), INTERVAL 5 YEAR)";
            try (PreparedStatement statement = DBConnection.getInstance().prepareStatement(sql)) {
                statement.executeUpdate();
                System.out.println("Salariile angajatilor au fost actualizate cu succes!");
                auditService.addAction("updateAngajatSalary");
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
}

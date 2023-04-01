package services;

import models.Angajat;
import java.util.Map;
import java.time.LocalDate;

public class AngajatService {

    private Map <Integer, Angajat> angajati;
    public void addAngajat(int id, Angajat angajat) {
        angajati.put(id, angajat);
    }

    public void removeAngajat(int id) {
        angajati.remove(id);
    }

    public  Map <Integer, Angajat> updateAngajat(Angajat angajat) {
        // pentru angajatii cu hiredate cu 5 ani in urma se va actualiza salariul cu 15%
        int year = LocalDate.now().getYear();
        if (angajat.getHireDate().getYear() < year - 5) {
            angajat.setSalary(angajat.getSalary() + angajat.getSalary() * 15 / 100);
        }
       return angajati;
    }

    public Map<Integer,Angajat> getAngajat(int id) {
        return angajati;
    }
}

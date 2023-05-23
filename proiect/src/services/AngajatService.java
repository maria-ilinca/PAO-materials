package services;

import models.Angajat;
import repository.AngajatRepository;

public class AngajatService {
    private AngajatRepository angajati = new AngajatRepository();
    public void addAngajat(Angajat angajat) {
        angajati.addAngajat(angajat);
    }

    public void removeAngajat(int id) {
        angajati.removeAngajat(id);
    }

    public  void updateAngajatSalary() {
        angajati.updateAngajatSalary();
    }

    public void getAngajat() {
        angajati.getAngajat();
    }
}

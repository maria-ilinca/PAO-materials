package implementari;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// date membre: marca, model, capacitate, pret
// impl toString, equals, hashCode
 class Automobil {
    private String marca;
    private String model;
    private double capacitate;
    private int pret;
    
    public Automobil(String marca, String model, double capacitate, int pret) {
        this.marca = marca;
        this.model = model;
        this.capacitate = capacitate;
        this.pret = pret;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getModel() {
        return model;
    }
    
    public double getCapacitate() {
        return capacitate;
    }
    
    public int getPret() {
        return pret;
    }
    
    @Override
    public String toString() {
        return marca + " " + model + " " + capacitate + " " + pret;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Automobil)) {
            return false;
        }
        Automobil a = (Automobil) o;
        return marca.equals(a.marca) && model.equals(a.model) && capacitate == a.capacitate && pret == a.pret;
    }
    
    @Override
    public int hashCode() {
        return marca.hashCode() + model.hashCode() + (int) capacitate + pret;
    }
}

public class ex2 {
    public static void main(String[] args) {
        Automobil a1 = new Automobil("BMW", "X2", 2000, 3000);
        Automobil a2 = new Automobil("BMW", "X6", 2000.5 , 5000);
        Automobil a3 = new Automobil("BMW", "X1", 2800.75, 4500);
        Automobil a4 = new Automobil("Mercedes", "S Class", 2200.25, 15000);
        // lista.stream().filter(lambda expresie -- Predicate<T> -> boolean) 
        // verificam daca ob -> ob.getPret() >= 5000
        List<Automobil> lista_mas = List.of(a1, a2, a3);
        lista_mas.stream().filter(ob -> ob.getPret() >= 5000);
        // sortam in ordinea descr a preturilor 
        // int compare (object o1, object o2) -> returneaza -1 daca o1 < o2, 0 daca o1 == o2, 1 daca o1 > o2
        lista_mas.stream().sorted((ob1, ob2) -> ob1.getPret() - ob2.getPret());
        // if (ob1.getPret() < ob2.getPret()) {
        //     return -1;
        // } else if (ob1.getPret() == ob2.getPret()) {
        //     return 0;
        // } else {
        //     return 1;
        // }
        // in interfata Comparator avem functia impl comparing=> Comparator.comparingInt(Automobil::getPret)
        // exista metoda reverse pentru a intoarce lista sortata in ordine inversa


        // afisati marcile distincte
         lista_mas.stream().map(Automobil::getMarca)
                    .distinct()
                    .forEach(System.out::println);

         // lista formata din automob cu capacitatea e intre 2000 si 3000
        Predicate <Automobil> c1 = ob -> ob.getCapacitate() >= 2000;
        Predicate <Automobil>c2 = ob -> ob.getCapacitate() <= 3000;

         lista_mas.stream().filter(ob-> c1.and(c2).test(ob))
                 .collect(Collectors.toList());


    }
}



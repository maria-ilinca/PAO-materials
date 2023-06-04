package implementari;

import java.io.*;

class Persoana implements Serializable {
    String nume;
    int varsta;

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
        System.out.println("Constructor");
    }
}
public class testp {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persoana.ser"));
        Persoana p = new Persoana("Ion", 20), q =p ;
        oos.writeObject(q);
        oos.close();
        ObjectInputStream oos2 = new ObjectInputStream(new FileInputStream("persoana.ser"));

        Persoana r = (Persoana) oos2.readObject();
        oos2.close();
    }
}

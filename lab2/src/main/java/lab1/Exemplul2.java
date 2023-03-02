package main.java.lab1;

public class Exemplul2 {
    public static void main(String args[]){
        Exemplul1.main(null);

        Exemplul1 obiect1 = new Exemplul1();
        obiect1.setNumarlaborator(1);
        obiect1.main(null);
        System.out.println(obiect1.getNumarlaborator()); //1
        System.out.println(obiect1.numarlaborator); //1

        Exemplul1 obiect2 = new Exemplul1();
        obiect2.setNumarlaborator(2);
        System.out.println(obiect2.numarlaborator); //2

        Exemplul1 obiect3 = new Exemplul1();
        System.out.println(obiect3.numarlaborator); //0
    }

}

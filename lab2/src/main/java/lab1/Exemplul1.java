package main.java.lab1;

public class Exemplul1 {

    // membrii unei clase care: campuri + metode

     int numarlaborator; // camp => proprietate

    public int getNumarlaborator(){ //metode => comportament
        return numarlaborator;
    }

    public void setNumarlaborator(int numarlaborator){
        this.numarlaborator=numarlaborator;
    }
    /* specif de acces:
    - public;
    - private;
    - default (accesibili din ac pachet);
    - protected (1/2 public, 1/2 private) */
    public static void main (String args[]){

    }
}

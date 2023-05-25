package implementari;

// clasa care sa calculeze de cate ori apare un cuv dat intr un fisier folosind fire de executie
// se citeste cuv de la tastatura si afis nr de aparitii in fis exemplu_1.txt, exemplu_2.txt, exemplu_3.txt

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.stream.Stream;

public class FirFisier extends Thread {

    private String path;
    private String cuv;
    private int nrAparitii;

    public FirFisier(String path, String cuv) {
        this.path = path;
        this.cuv = cuv;
    }

    @Override
    public void run() {
        Scanner fin = null;
        try {
            fin = new Scanner(new File(path));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String linie;
         while (fin.hasNextLine()) {
              linie = fin.nextLine();
              String[] date = linie.split("[ .,!?]  + ");
              Stream.of(date).filter(cuv -> cuv.equals(this.cuv)).count();
         }
    }

    public int getNrAparitii() {
        return nrAparitii;
    }
}



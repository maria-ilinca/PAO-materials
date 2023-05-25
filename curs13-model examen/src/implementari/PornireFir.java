package implementari;

import java.util.Scanner;
import java.util.stream.Stream;

public class PornireFir {
    public static void main(String[] args) throws InterruptedException {

        String cuv =  new Scanner(System.in).nextLine();
        FirFisier fir1 = new FirFisier("exemplu_1.txt",cuv);
        FirFisier fir2 = new FirFisier("exemplu_2.txt",cuv);
        FirFisier fir3 = new FirFisier("exemplu_3.txt",cuv);
        fir1.start();
        fir2.start();
        fir3.start();

        // run
        fir1.join();
        fir2.join();
        fir3.join();

        System.out.println(fir1.getNrAparitii() + fir2.getNrAparitii() + fir3.getNrAparitii());
    }
}

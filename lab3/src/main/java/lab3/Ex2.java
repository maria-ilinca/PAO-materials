package main.java.lab3;

import java.util.Scanner;

public class Ex2 {
    public static void main (String[] args)
    {
       /* Citim de la tastatura 2 valori: numele + varsta
       Afisam numele
       Daca varsta e impara/para, atunci afisati toate nr impare/pare < varsta
       */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numele: ");
        String nume = scanner.nextLine();
        System.out.println("Numele introdus este: " + nume);

        System.out.println("Introduceti varsta: ");
        int varsta = scanner.nextInt();

        int i = varsta % 2 == 0 ? 0 : 1;
        for (int j = i; j <= varsta; j += 2) {
            System.out.println(j);
        }

        while (i <= varsta) {
            System.out.println(i);
            i += 2;
        }
    }
}

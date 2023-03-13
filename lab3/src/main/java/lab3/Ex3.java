package main.java.lab3;

import java.util.Arrays;

public class Ex3 {
    public static void main (String[] args)
    {
        // declarare array
        int [] ar1; // mai explicita
        int ar2 [],i3, arr3[], i4;
        // intializare array
        int [] array1 = {1, 3, 5, 7};
        int [] array2 = new int [6];
        int [] array3 = new int []{1, 3, 5, 7};
        int [] array4 = array2;

        System.out.println(array1);
        System.out.println("Comparatie referinta: " + (array1 == array3));
        System.out.println("Comparatie continut: " + Arrays.compare(array1, array3));
        System.out.println("Comparatie obiecte: " + Arrays.equals(array1, array3));

        // parcurgere array
        for (int i=0;i<array1.length; i++) {
            System.out.println(array1[i]);
        }

        for (int i=0;i<array4.length; i++) {
            System.out.println(array4[i]);
        }
    }
}

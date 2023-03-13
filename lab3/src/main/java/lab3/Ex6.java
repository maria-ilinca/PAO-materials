package main.java.lab3;

import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args) {
        char [] chars = {'j','a','v','a'};
        System.out.println(Arrays.binarySearch(chars, 't')); // daca nu gas o valoare, ret  (-insertionPoint) - 1
    }
}

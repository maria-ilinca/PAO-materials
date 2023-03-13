package main.java.lab3;

import java.util.Arrays;

public class Ex4 {
    public static void main (String[] args){
        char[] chars = {'j','a','v','a'};
        for (char c: chars) {
            System.out.println(c);
        }

        System.out.println("Arrays to string: ");
        System.out.println(Arrays.toString(chars));
    }
}

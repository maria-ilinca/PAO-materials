package main.java.lab1;

public class Exemplul4 {
    public static void main(String args[]){
       System.out.println(5 % 1);
       int a = 5;
       int b = 6;
       System.out.println(a == b);
       boolean c = 5==5;
       System.out.println(c);
       int d = (a==b ? 100 :(c==true ? 50 : 0));
       System.out.println(d);
    }
}

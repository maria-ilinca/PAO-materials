package grile;

class Ca{
    public static int a = 1;
    public int b = 1;
    public void met(){
        a++;
        b++;
    }
}

public class ceva {
    public static void main(String[] args) {
        Ca c1 = new Ca();
        Ca c2 = new Ca();
        c1.met();
        c2.met();
        System.out.println(c1.a  + c2.b);
    }
}

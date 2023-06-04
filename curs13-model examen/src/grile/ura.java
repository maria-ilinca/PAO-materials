package grile;

class D {
    public int a;
    public static int b;

    public D(){
        b++;
        b = b + a;
    }

    public void met()
    {
        a = a + b;
        a ++;
    }
}

public class ura {
    public static void main(String[] args) {
        D d1 = new D();
        //d1.met();
        D d2 = new D();
        //d2.met();
        System.out.println(d1.a + " " + d2.a + " " + d1.b + " " + d2.b);
    }
}

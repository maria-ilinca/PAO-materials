package grile;

class C
{
    static int x = 1;
    static int f () {
        return x++;
    }

    static int g() {
        return --x;
    }
}
public class exstatic {
    public static void main(String[] args) {
        System.out.println(C.f() + " " + C.g() +" " + C.x);
    }
}

package grile;

import java.util.HashMap;

class A{
    int a;
    public A (int i) {
       a =i;
    }
    public int hashCode() {
        return a;
    }

    public boolean equals(Object other)
    {
        return true;
    }
}

public class ex1 {
    public static void main(String[] args) {
        HashMap<A, Integer> H = new HashMap<A, Integer>();
        H.put (new A(1), 1);
        H.put (new A(1), 1);
        H.put (new A(2), 2);
        H.put (new A(2), 2);
        H.forEach((a,b)->System.out.println(a + " " + b));


    }

}

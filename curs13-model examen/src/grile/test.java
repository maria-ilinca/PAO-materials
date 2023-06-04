package grile;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class test {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i < 11; i++)
            l.add(i);
        Iterator<Integer> it = l.iterator();
        while (it.hasNext()) {
            Integer x = it.next();
            if (x % 2 == 0)
                it.remove();
        }
        System.out.println(l);
    }
}

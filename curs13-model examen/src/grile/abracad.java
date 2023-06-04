package grile;

public class abracad {
    public static void main(String[] args) {
        String s = "abracadabra";
        s.replace('r', 'R');
        int p = s.indexOf('R');
        int q = s.lastIndexOf('b');
        s = s.substring(0,q-p);
        System.out.println(s.length());
    }
}

package grile;

public class strings {
    public static void main(String[] args) {
        String s = "academician";
        int p = s.lastIndexOf('c');
        int q = s.indexOf(s.charAt(p));
        s = s.substring(q,p);
        System.out.println(s);
    }
}

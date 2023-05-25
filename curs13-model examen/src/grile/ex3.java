package grile;

public class ex3 {
    public static void main(String[] args) {
        String s = "abcbd";
        String t = "Programare";
        int p = t.indexOf(s.charAt(0)); // cautam a in Programare
        t = t.substring(0, p) + t.substring(p + 1); // inlocuim a cu nimic
        System.out.println(t); // Progrmare
    }
}

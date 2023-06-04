package grile;

// 05142
public class pb3{
    public static void main(String[] args) {
        String s = " ";
        for (int i = 0; i <=5; i++) {
            s += i;
            s+=5-i;
        }
        int p = s.lastIndexOf("2");
        //System.out.println(p);
        s = s.substring(p);
        //System.out.println(s);
        System.out.println(s.length());
    }
}
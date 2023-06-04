package grile;

public class tests {
    static String sir = "A";
    void A() {
        try {
            sir += "B";
            B();
        } catch (Exception e) {
            sir += "C";
        }
    }
    void B() throws Exception {
        try {
            sir += "D";
            C();
        } catch (Exception e) {
            throw new Exception();
        } finally {
            sir += "E";
        }
    }
    void C() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {
        tests ob = new tests();
        ob.A();
        System.out.println(sir);
    }
}

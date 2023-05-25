package grile;

class A1 {
    String sir = "";
    public A1(String sir) {
        this.sir = this.sir + sir + "A";
    }
}

class B1 extends A1 {
    public B1(String sir) {
        super(sir);
        this.sir = this.sir + sir + "B";
    }
}

class C1 extends B1 {
    public C1(String sir) {
        super(sir);
        this.sir = this.sir + sir + "C";
    }
}

public class ex5 {
    public static void main(String[] args) {
        System.out.println(new C1("D").sir);
    }
}
// DADBDC

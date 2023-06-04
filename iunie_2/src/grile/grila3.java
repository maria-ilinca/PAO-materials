package grile;

class Super {
    public Super(){print();}
    public void print() {
        System.out.println("Super");
    }
}

class Sub extends Super {
    public Sub() {print();}
    public void print() {
        System.out.println("Sub");
    }
}
public class grila3 {
    public static void main(String[] args) {
        Super s = new Super();
        s.print();

    }
}

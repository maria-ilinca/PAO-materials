package grile;

class A1 {
    int a;

    public A1(int i) {
        a = i;
    }

    public String toString() {
        return "A" + a % 3;
    }

    public int get() {
        return a / 3;
    }
}

    interface Interface1{void f (int x);}
    interface Interface2{int f ();}

    interface Interface3{String f(String s);}
    interface Interface4{void f(String s);}

public class Test {
    public static void main(String[] args) {
        int x = 44;
        A1 obj = new A1(x);
        Interface1 ob1 = i -> System.out.println(i*3 + " ");
        Interface2 ob2 = () ->obj.get();
        Interface3 ob3 = s -> s.substring(1);
        Interface4 ob4 = s -> System.out.println(s);

        ob1.f(ob2.f());
        ob4.f(ob3.f(obj.toString()));
    }
}

package grile;

    class A{
        public static int f (int x){
            return x + 1;
        }
        public int g (int x){
            return x + 2;
        }
    }

    class B extends A {
        public static int f(int x) {
            return x + 4;
        }

        public int g(int x) {
            return x + 3;
        }
    }

    public class ex4 {
        public static void main(String[] args) {
            A a = new B();
            System.out.println(a.f(1) + a.g(3));
            // apelam f din A si g din B pt ca f in A e statica

            B b = new B();
            System.out.println(b.f(1) + b.g(3));
            // se redef constructorul metodei statice in java
        }
    }


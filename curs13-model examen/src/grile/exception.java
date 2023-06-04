package grile;

class E{
    public static void met_1() throws Exception {
       try{
           throw new Exception();
       }
       finally {
              System.out.println("A");
       }
    }

    public static void met_2() throws Exception {
        try{
           met_1();
        }
        catch (Exception e){
            System.out.println("B");
        }
    }
}

public class exception {
    public static void main(String[] args) {
        try{
            E.met_2();
        }
        catch (Exception e){
            System.out.println("C");
        }
        finally {
            System.out.println("D");
        }
        System.out.println("E");
    }
}

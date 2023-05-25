package grile;

public class ex2 {
    public static void main(String[] args) {
        new ex2().test();
    }
    void test()
    {
        try{
            met();
        }
        catch (NullPointerException ex){
            System.out.println("NPE");
        }
        catch (Exception ex){
            System.out.println("EX"); // exceptia este de tipul IllegalArgumentException
        }
        finally{
            System.out.println("FIN ");
        }
        System.out.println("END");
    }
    // metoda met va arunca ex de tip IllegalArgumentException
    void met() throws IllegalArgumentException
    {
        throw new IllegalArgumentException();
    }

}

// EX, FIN, END

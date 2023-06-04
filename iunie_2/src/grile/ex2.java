package grile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) throws FileNotFoundException {
        for (int i = 1; i <= 5; i++) {
            try (Scanner sc = new Scanner (new File("file" + i + ".txt"))){
                System.out.println(sc.nextInt());
            } catch (FileNotFoundException e) {
                System.out.println("!");

            }
            catch (Exception e) {
                System.out.println("?");
            }
            finally {
                System.out.println("F");
            }
        }
    }
}

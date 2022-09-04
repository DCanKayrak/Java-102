package HackerRank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);

        int result;
        try {
            int x = gir.nextInt();
            int y = gir.nextInt();
            result = x / y;
            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }

}

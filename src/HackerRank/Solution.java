package HackerRank;
import java.io.*;
import java.util.*;


public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scan=new Scanner(System.in);
            while (scan.hasNext()) {


                try {
                    double x = scan.nextInt();
                    double y =scan.nextInt();
                    if(y==0.0&&x==0.0) {
                        System.out.println("java.lang.Exception: n and p should not be zero.");
                    }
                    else if(y<0||x<0){
                        System.out.println("java.lang.Exception: n or p should not be negative.");
                    }
                    else {

                        double z =Math.pow(x, y);
                        int k = (int) z;
                        System.out.println(k);
                    }




                }catch (Exception e) {
                    System.out.println("java.util.InputMismatchException");
                }
            }
        }
}
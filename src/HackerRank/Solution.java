package HackerRank;
import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);
        System.out.println(MyCalculator.power(gir.nextInt(),gir.nextInt()));
        System.out.println(MyCalculator.power(gir.nextInt(),gir.nextInt()));
        System.out.println(MyCalculator.power(gir.nextInt(),gir.nextInt()));
        System.out.println(MyCalculator.power(gir.nextInt(),gir.nextInt()));
        System.out.println(MyCalculator.power(gir.nextInt(),gir.nextInt()));

    }
}
class MyCalculator {

    public static String power(int p,int n){
        double result;
        try{
            if(n<0 || p<0)
                throw new Exception("java.lang.Exception: n or p should not be negative.");
            else if(n==0&&p==0)
                throw new Exception("java.lang.Exception: n and p should not be zero.");
            else
                return ""+(long)Math.pow(p,n);
        }catch (Exception e){
            return e.getMessage();
        }
    }
}
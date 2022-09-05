package HackerRank;
import java.util.*;
import java.util.Scanner;
public class ArraylistsSolution {


    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);
        int satir = gir.nextInt();
        ArrayList[] arr = new ArrayList[20000];
        for(int i=0;i<satir;i++){
            int index = gir.nextInt();
            arr[i] = new ArrayList<>();
            for(int j=0;j<index;j++){
                int value = gir.nextInt();
                arr[i].add(value);
            }
        }

        int q = gir.nextInt();

        for(int a=0;a<q;a++){
            int satirr = gir.nextInt();
            int sutun = gir.nextInt();

            try{
                System.out.println(arr[satirr-1].get(sutun-1));;
            }catch (Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}

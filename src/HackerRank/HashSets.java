package HackerRank;
import java.util.*;

public class HashSets {
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);
        int a = gir.nextInt();
        HashSet<String> h = new HashSet<>();

        while(gir.hasNext()){
            String text = gir.next();
            String text2 = gir.next();
            String sumText = text+" "+text2;
            h.add(sumText);
            System.out.println(h.size());

        }
    }
}

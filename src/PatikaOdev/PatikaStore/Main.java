package PatikaOdev.PatikaStore;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
public class Main {

    public static void main(java.lang.String[] args) {
        Scanner in = new Scanner(System.in);

        Queue<String> markalar = new PriorityQueue<>();
        addMarka(markalar,"Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster");

        Queue<Telefon> telefon = new PriorityQueue<>();
        telefon.add(new Telefon(1,3199.0,0,10,"SAMSUNG GALAXY A51","Samsung",8,5,128,4000,"Siyah/Gri/Beyaz"));

        System.out.println("Patika Store'a hoşgeldiniz.\nTelefonlar için 1'e\nLaptoplar için 2'ye basınız.\nMarkaları sıralamak için 3'e basınız.\nÇıkış için 4'e tıklayın.");
        int category = in.nextInt();

        switch(category){
            case 1:
                // telefon
                break;
            case 2:
                System.out.println("Laptop");
                break;
            case 3:
                System.out.println("---------------------------");
                markalariSirala(markalar);
                System.out.println("---------------------------");
                break;
            case 4:
                System.out.println("İyi günler dileriz!");
                break;
        }
    }
    private static void addMarka(Queue<String> list, java.lang.String... marka){
        int id = 1;
        for(int i=0;i< marka.length;i++){
            list.add(new String(""+marka[i],id));
            id++;
        }
    }
    private static void markalariSirala(Queue<String> markalar){
        for (String m:markalar) {
            System.out.println("- "+m.getName());
        }
    }

}

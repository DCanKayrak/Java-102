package PatikaOdev.KitapSirala;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Set<Book> kitaplarOrderedByName = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
        Set<Book> kitaplarOrderedByPage = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNum()-o2.getPageNum();
            }
        }.reversed());

        kitaplarOrderedByName.add(new Book("Harry Poter",150));
        kitaplarOrderedByName.add(new Book("Şeker Portakalı",87));
        kitaplarOrderedByName.add(new Book("Kavgam",550));
        kitaplarOrderedByName.add(new Book("Şu Çılgın Türkler",747));
        kitaplarOrderedByName.add(new Book("İki Dirhem Bir Çekirdek",211));

        kitaplarOrderedByPage.add(new Book("Harry Poter",150));
        kitaplarOrderedByPage.add(new Book("Şeker Portakalı",87));
        kitaplarOrderedByPage.add(new Book("Kavgam",550));
        kitaplarOrderedByPage.add(new Book("Şu Çılgın Türkler",747));
        kitaplarOrderedByPage.add(new Book("İki Dirhem Bir Çekirdek",211));

        System.out.println("--------------------------------");
        System.out.println("Kitapların Adlarına göre A-Z sıralanışı : ");
        System.out.println("--------------------------------");

        for (Book k:kitaplarOrderedByName) {
            System.out.println(k.getName());
        }
        System.out.println("--------------------------------");
        System.out.println("Kitapların Sayfa Sayılarına göre sıralanışı : ");
        System.out.println("--------------------------------");
        for (Book k:kitaplarOrderedByPage) {
            System.out.println(k.getName());
        }

    }
}

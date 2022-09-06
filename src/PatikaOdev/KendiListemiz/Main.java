package PatikaOdev.KendiListemiz;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> liste = new MyList<>();
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        System.out.println(liste.isEmpty());
        liste.add(10);
        liste.add(20);
        System.out.println(liste.get(1));
        liste.add(30);
        liste.add(40);
        liste.add(10);
        liste.add(50);

        System.out.println(liste.size());
        System.out.println(liste.toString());
        // System.out.println(liste.indexOf());
        System.out.println(liste.isEmpty());
        System.out.println(liste.lastIndexOf(10));
        System.out.println(liste.contains(30));
        System.out.println(liste.sublist(0,3));
        System.out.println(liste.toString());
    }
}

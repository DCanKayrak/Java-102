package PatikaOdev.PatikaStore;

import com.sun.source.tree.Tree;

import java.util.*;

public class PatikaStore {
    private TreeSet<Brand> brands = new TreeSet<>(new Comparator<Brand>() {
        @Override
        public int compare(Brand o1, Brand o2) {
            return o1.getName().compareTo(o2.getName());
        }
    });

    private TreeSet<Telefon> phones = new TreeSet<>(new Comparator<Telefon>() {

        @Override
        public int compare(Telefon o1, Telefon o2) {
            return o1.getName().compareTo(o2.getName());
        }
    });

    private TreeSet<Laptop> laptops = new TreeSet<>(new Comparator<Laptop>() {

        @Override
        public int compare(Laptop o1, Laptop o2) {
            return o1.getName().compareTo(o2.getName());
        }
    });
    public PatikaStore(){

        //Samsung, Lenovo, Apple, Huawei, Casper, Asus, HP, Xiaomi, Monster
        addBrand("Samsung",1);
        addBrand("Lenovo",2);
        addBrand("Apple",3);
        addBrand("Huawei",4);
        addBrand("Casper",5);
        addBrand("Asus",6);
        addBrand("HP",7);
        addBrand("Xiaomi",8);
        addBrand("Monster",9);

        Telefon t = new Telefon(1,3199.0,0,10,"SAMSUNG GALAXY A51",)

    }
    void run(){
        Scanner in = new Scanner(System.in);

        System.out.println("Patika Store'a hoşgeldiniz.\nTelefonlar için 1'e\nLaptoplar için 2'ye basınız.\nMarkaları sıralamak için 3'e basınız.\nÇıkış için 4'e tıklayın.");
        int category = in.nextInt();

        switch(category){
            case 1:
                // telefon
                showPhoneList();
                break;
            case 2:
                System.out.println("Laptop");
                showLaptopList();
                break;
            case 3:
                System.out.println("---------------------------");
                showBrandList();
                System.out.println("---------------------------");
                break;
            case 4:
                System.out.println("İyi günler dileriz!");
                break;
        }
    }

    void addBrand(String name,int id){
        brands.add(new Brand(name,id));
    }
    void showBrandList(){
        for (Brand b:brands) {
            System.out.println(b.getName());
        }
    }
    void showPhoneList(){
        for(Telefon p:phones){
            System.out.println(p.getName());
        }
    }
    void showLaptopList(){
        for(Laptop l:laptops){
            System.out.println(l.getName());
        }
    }
}

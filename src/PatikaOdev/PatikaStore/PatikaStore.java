package PatikaOdev.PatikaStore;

import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;

public class PatikaStore {
    private ArrayList<Brand> brands = new ArrayList<>();
    private ArrayList<Telefon> phones = new ArrayList<>();
    private ArrayList<Laptop> laptops = new ArrayList<>();

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

        phones.add(new Telefon(1,3199.0,0,10,"SAMSUNG GALAXY A51",brands.get(0),8,5.3,128,5000,"Black"));
        phones.add(new Telefon(2,7000.0,0,20,"iPhone 11 64 GB",brands.get(7),12,6.1,256,4500,"White"));
        phones.add(new Telefon(3,4012,0,15,"Redmi Note 10 Pro 8GB",brands.get(2),4,5.7,64,4300,"Rose Red"));
    }
    void run(){
        Scanner in = new Scanner(System.in);

        System.out.println("Patika Store'a hoşgeldiniz.\nTelefonlar için 1'e\nLaptoplar için 2'ye basınız.\nMarkaları sıralamak için 3'e basınız.\nÇıkış için 4'e tıklayın.");
        int category = in.nextInt();

        switch(category){
            case 1:
                System.out.println("----------------------------------------------------------------------------------------------------");
                System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
                System.out.println("----------------------------------------------------------------------------------------------------");
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
        // Sıraladık.
        brands.sort(new Comparator<Brand>() {
            @Override
            public int compare(Brand o1, Brand o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
        // foreach ile döndürdük.
        for (Brand b:brands) {
            System.out.println(b.getName());
        }
    }
    void showPhoneList(){
        phones.sort(new Comparator<Telefon>() {
            @Override
            public int compare(Telefon o1, Telefon o2) {
                return o1.getId()-o2.getId();
            }
        });
        for(Telefon p:phones){
            System.out.println("|"+p.getId()+"|"+p.getName()+"|"+p.getPriceForUnit()+"|"+p.getMarka().getName()+"|"+ p.getStorage()+"|"+p.getScreenSize()+"|"+p.getRam()+"|");
        }
    }
    void showLaptopList(){
        laptops.sort(new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });

        for(Laptop l:laptops){
            System.out.println(l.getName());
        }
    }
}

package PatikaOdev.PatikaStore;

public class Laptop extends Product{
    private int storage;
    private double screenSize;
    private int ram;

    public Laptop(int id, double priceForUnit, double discountRate, int stokAmount, java.lang.String name, Brand marka, int ram, double screenSize, int storage) {
        super(id, priceForUnit, discountRate, stokAmount, name, marka);
        this.ram = ram;
        this.screenSize = screenSize;
        this.storage = storage;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}

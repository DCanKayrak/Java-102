package PatikaOdev.PatikaStore;

public class Telefon extends Product{
    private int storage;
    private double screenSize;
    private int battery;
    private int ram;
    private java.lang.String color;

    private Brand marka;
    public Telefon(int id, double priceForUnit, double discountRate, int stokAmount, java.lang.String name, Brand marka, int ram, double screenSize, int storage, int battery, java.lang.String color) {
        super(id, priceForUnit, discountRate, stokAmount, name, marka);
        this.ram = ram;
        this.screenSize = screenSize;
        this.storage = storage;
        this.color = color;
        this.battery = battery;
        this.marka = marka;
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

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public java.lang.String getColor() {
        return color;
    }

    public void setColor(java.lang.String color) {
        this.color = color;
    }

    @Override
    public Brand getMarka() {
        return marka;
    }

    @Override
    public void setMarka(Brand marka) {
        this.marka = marka;
    }
}

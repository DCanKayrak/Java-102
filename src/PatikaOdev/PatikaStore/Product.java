package PatikaOdev.PatikaStore;

import java.util.Comparator;

public class Product implements Comparable<Product> {
    private int id;
    private double priceForUnit;
    private double discountRate;
    private int stokAmount;
    private java.lang.String name;
    private String marka;

    public Product(int id, double priceForUnit, double discountRate, int stokAmount, java.lang.String name, String marka) {
        this.id = id;
        this.priceForUnit = priceForUnit;
        this.discountRate = discountRate;
        this.stokAmount = stokAmount;
        this.name = name;
        this.marka = marka;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPriceForUnit() {
        return priceForUnit;
    }

    public void setPriceForUnit(double priceForUnit) {
        this.priceForUnit = priceForUnit;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getStokAmount() {
        return stokAmount;
    }

    public void setStokAmount(int stokAmount) {
        this.stokAmount = stokAmount;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public int compareTo(Product o) {
        return getName().compareToIgnoreCase(o.getName());
    }
}

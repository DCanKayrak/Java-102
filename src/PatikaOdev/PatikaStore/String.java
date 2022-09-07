package PatikaOdev.PatikaStore;

public class String implements Comparable<String> {
    private java.lang.String name;
    private int id;

    public String(java.lang.String name, int id) {
        this.name = name;
        this.id = id;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(String o) {
        return this.getName().compareToIgnoreCase(o.getName());
    }
}

package PatikaOdev.KitapSirala;

public class Book implements Comparable<Book>{
    private String name;
    private int pageNum;

    public Book(String name, int pageNum) {
        this.name = name;
        this.pageNum = pageNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    @Override
    public int compareTo(Book o) {
        return getName().compareToIgnoreCase(o.getName());
    }
}

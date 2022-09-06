package HackerRank;
import java.util.*;
public class PriorityQueueSolution {

    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);
        int numOfEvents = gir.nextInt();

        Queue<Student> q = new PriorityQueue<>(Comparator.comparing(Student::getCgpa).reversed()
                .thenComparing(Student::getName));


        while(gir.hasNextLine()){
            String value = gir.next();
            if(value.equals("ENTER")){
                    String name = gir.next();
                    double note = Double.parseDouble(gir.next());
                    int id = gir.nextInt();
                    q.add(new Student(name,note,id));
            }else if(value.equals("SERVED")){
                q.poll();
            }
        }

        for (Student s:q) {
            System.out.println(s.getName());
        }
    }
}
class Student{
    private String name;
    private double cgpa;
    private int id;

    public Student(String name, double note, int id) {
        this.name = name;
        this.cgpa = note;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

package prak9.num4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>();

        students1.add(new Student("Алиса", 4.0));
        students1.add(new Student("Никита", 3.7));
        students1.add(new Student("Вася", 3.9));
        students1.add(new Student("Николай", 3.5));

        System.out.println(Double.valueOf(students1.get(0).getGPA()).compareTo(Double.valueOf(students1.get(1).getGPA())));
    }
}

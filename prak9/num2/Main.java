package prak9.num2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>();

        students1.add(new Student("Alice", 4.0));
        students1.add(new Student("Bob", 3.7));
        students1.add(new Student("Charlie", 3.9));
        students1.add(new Student("David", 3.5));

        for (Student i: students1) {
            System.out.println(i);
        }

        Collections.sort(students1, new SortingStudentsByGPA());

        System.out.println("");
        for (Student i: students1) {
            System.out.println(i);
        }
    }
}

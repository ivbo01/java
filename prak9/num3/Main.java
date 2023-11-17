package prak9.num3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> student1 = new ArrayList<>();
        List<Student> student2 = new ArrayList<>();

        student1.add(new Student("Алиса", 3.8));
        student1.add(new Student("Никита", 3.7));

        student2.add(new Student("Вася", 4.0));
        student2.add(new Student("Николай", 3.5));

        List<Student> sortStudents = mergeSort(student1, student2);

        for (Student i: sortStudents) {
            System.out.println(i);
        }
    }

    public static List<Student> mergeSort(List<Student> list1, List<Student> list2) {
        List<Student> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size()) { // проход обоих списков
            if (list1.get(i).getGPA() > list2.get(j).getGPA()) { // сравниваем чей GPA больше у текущих студентов
                result.add(list1.get(i));
                i++;
            } else {
                result.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            result.add(list1.get(i));
            i++;
        }
        while (j < list2.size()) {
            result.add(list2.get(j));
            j++;
        }
        return result;
    }

}

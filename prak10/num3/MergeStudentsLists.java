package prak10.num3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeStudentsLists {
    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>();
        List<Student> students2 = new ArrayList<>();

        students1.add(new Student("Николай", 3.5));
        students1.add(new Student("Алиса", 4.0));
        students1.add(new Student("Андрей", 3.7));

        students2.add(new Student("Алексей", 3.7));
        students2.add(new Student("Николай", 2.2));

        List<Student> mergedList = mergeAndSort(students1, students2);

        for (Student i: mergedList) {
            System.out.println(i);
        }
    }

    public static List<Student> mergeAndSort(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>(list1); // создание объединённого списка и записываем содержимое первого списка
        mergedList.addAll(list2); // записываем содержимое второго списка

        Collections.sort(mergedList, Comparator.comparingDouble(Student::getGPA).reversed());

        return mergedList;
    }
}
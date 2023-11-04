package prak9.num1;

public class TestStudent {
    public static void main(String[] args) {
        Student[] students1 = {
            new Student("Алиса", 5),
            new Student("Никита", 3),
            new Student("Вася", 8),
            new Student("Николай", 2)
        };

        for (Student i: students1) {
            System.out.println(i);
        }

        for (int i = 0; i < students1.length; i++) {
            Student student_i = students1[i];
        
            while (i > 0 && students1[i - 1].getIDNumber() > student_i.getIDNumber()) {
                students1[i] = students1[i - 1];
                i--;
            }
        
            students1[i] = student_i;
        }
        System.out.println("");
        for (Student i: students1) {
            System.out.println(i);
        }
    }
}

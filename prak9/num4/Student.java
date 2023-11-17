package prak9.num4;

public class Student implements Comparable<Student> {
    private String name;
    private double GPA;

    public Student(String name, double GPA) {
        this.name = name;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
               "name='" + name + '\'' +
               ", GPA=" + GPA +
               '}';
    }

    @Override
    public int compareTo(Student studentArg) {
        // Сравниваем студентов по GPA в порядке убывания.
        // Если текущий GPA больше, возвращаем отрицательное число.
        // Если текущий GPA меньше, возвращаем положительное число.
        // Если GPA равны, возвращаем 0.
        return Double.compare(studentArg.getGPA(), this.GPA);
    }
}

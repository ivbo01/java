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
        // Если текущий GPA больше, возвращаем -1.
        // Если текущий GPA меньше, возвращаем 1.
        // Если GPA равны, возвращаем 0.
        return Double.compare(studentArg.getGPA(), this.GPA);
    }
}

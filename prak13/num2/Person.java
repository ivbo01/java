package prak13.num2;

public class Person { // Разработать класс Person
    private String name;
    private String surname;
    private String middleName;

    public Person(String surname, String name, String middleName) {
        this.name = surname;
        this.surname = surname;
        this.middleName = middleName;
    }

    public String getFormattedName() { // в котором имеется функция, возвращающая Фамилию И.О.
        StringBuilder formattedName = new StringBuilder();
        formattedName.append(surname);

        if (name != null && !name.isEmpty()) { // Функция должна учитывать возможность отсутствия значений в полях Имя 
            formattedName.append(" ").append(name.charAt(0)).append(".");
        }

        if (middleName != null && !middleName.isEmpty()) { // и Отчество
            formattedName.append(" ").append(middleName.charAt(0)).append(".");
        }

        return formattedName.toString();
    }

    public static void main(String[] args) {
        Person person1 = new Person("Иванов", "Иван", "Иванович");
        System.out.println(person1.getFormattedName());

        Person person2 = new Person("Петров", "Петр", null);
        System.out.println(person2.getFormattedName());
    }
}


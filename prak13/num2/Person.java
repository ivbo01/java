package prak13.num2;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String getFormattedName() {
        StringBuilder formattedName = new StringBuilder();
        formattedName.append(lastName);

        if (firstName != null && !firstName.isEmpty()) {
            formattedName.append(" ").append(firstName.charAt(0)).append(".");
        }

        if (middleName != null && !middleName.isEmpty()) {
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


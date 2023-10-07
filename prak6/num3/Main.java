package prak6.num3;

// Интерфейс Nameable
interface Nameable {
    String getName();
}

class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Car implements Nameable {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Animal implements Nameable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Planet earth = new Planet("Земля");
        Animal lion = new Animal("Лев");
        Car Muscovite = new Car("Москвич");

        System.out.println(earth.getName());
        System.out.println(lion.getName());
        System.out.println(Muscovite.getName());
    }
}

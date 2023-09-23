В терминологии Джава базовый класс, от которого производится наследование называется суперкласс. Для организации наследования в Джава, используется ключевое слово – extends. 

```java
class Bicycle { // базовый класс велосипед
    public int gear; // поле
    public int speed; // поле
    public Bicycle(int gear, int speed) { // конструктор класса
        this.gear = gear;
        this.speed = speed;
    }
    public void applyBrake(int decrement) { //метод класса
        speed -= decrement;
    }
    public void speedUp(int increment) { //метод класса
        speed += increment;
    }
    public String toString() { // метод toString()чтобы печатать объекты Bicycle
    return ("No of gears are " + gear + " speed of bicycle is " + speed);
    }
}

class MountainBike extends Bicycle {  // производный класс горный велосипед
    public int seatHeight; //новое поле произв. класса
    public MountainBike(int gear, int speed, int startHeight) { //конструктор производного класса
        super(gear, speed);
        seatHeight = startHeight;
    }
    public void setHeight(int newValue) { // новый метод производного класса
        seatHeight = newValue;
    }

    @Override public String toString() { // переопределенный метод toString()класса Bicycle
        return (super.toString() + " seat height is " + seatHeight);
    }
}

public class Main { // класс тестер Main
    public static void main(String args[]) { // создаем объект родительского класса
        Bicycle bl = new Bicycle(5,200);
        System.out.println(bl.toString());
        MountainBike mb = new MountainBike(3, 100, 25);  // создаем объект дочернего класса
        System.out.println(mb.toString());
    }
}
```

```java
public abstract class Swim { // абстрактный метод
    abstract void swim(); // абстрактный класс может содержать и обычный метод
    void run() {
        System.out.println("Куда идешь?");
    }
}

class Swimmer extends Swim { //создаем производный класс Swimmer
    @Override
    public void swim() {
        System.out.println("Пловец плавает.");
    }
}
```

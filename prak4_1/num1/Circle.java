// С помощью наследования создайте дочерние классы Circle, Rectangle и Square.
// Круг
public class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public String getType() {
        return "Circle";
    }
    
    public double getArea() { // Также реализуйте во всех классах методы getArea()(возвращает площадь фигуры)
        return Math.PI * radius * radius;
    }

    public double getPerimeter() { // getPerimeter() взвращает периметр фигуры
        return 2 * Math.PI * radius;
    }
    
    public String toString() { // Переопределите в дочерних класс методы класса родителя toString()
        return "Circle";
    }
    
}

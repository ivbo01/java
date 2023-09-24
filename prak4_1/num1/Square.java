package prak4_1.num1;
// Квадрат
public class Square extends Shape {
    private double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    public String getType() {
        return "Square"; 
    }
    
    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }
    
    public String toString() {
        return "Square";
    }
}

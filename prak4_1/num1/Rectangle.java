package prak4_1.num1;
// Прямоугольник
public class Rectangle extends Shape {
    private double width;
    private double height;
    
    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    public String getType() {
        return "Rectangle";
    }
    
    public double getArea() {
        return width * height;
    }
    
    public double getPerimeter() {
        return 2 * (width + height);
    }
    
    public String toString() {
        return "Rectangle";
    }
    
}

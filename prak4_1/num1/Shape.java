public class Shape { // Необходимо реализовать простейший класс Shape (Фигура).
    private String type;

    public Shape(String type) {
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
    
    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }
    
    public String toSpring() {
        return "Shape";
    }
}

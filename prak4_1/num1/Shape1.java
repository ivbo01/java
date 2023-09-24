public abstract class Shape { // Теперь класс Shape - абстрактный
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
    
    public abstract double getArea();
    public abstract double getPerimeter();
    
    public String toSpring() {
        return "Shape";
    }
}

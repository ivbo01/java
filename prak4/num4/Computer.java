package prak4.num4;
// Создать класс, описывающий сущность компьютер (Computer)
class Computer {
    // Для описания составных частей компьютера использовать отдельные классы (Processor, Memory, Monitor).
    private Brand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(Brand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public void printComputer() {
        System.out.println("Марка компьютера: " + brand);
        System.out.println("Процессор: " + processor.getModel() + " (" + processor.getGHz() + " GHz)");
        System.out.println("Оперативная память: " + memory.getSize() + " ГБ");
        System.out.println("Монитор: " + monitor.getModel() + " (" + monitor.getSize() + " дюймов)");
    }
    
    public static void main(String[] args) {
        // Создаем объекты для каждой части компьютера
        Processor processor = new Processor("Intel Core i5-9004f", 2.90);
        Memory memory = new Memory(16);
        Monitor monitor = new Monitor("G-Master GB2466HSU", 24);
        Computer myComputer = new Computer(Brand.Huawei, processor, memory, monitor);
        myComputer.printComputer();
    }

}

// Для названий марок компьютера используйте перечисления (enum)
enum Brand {
    ASUS, HP, DELL, LENOVO, Huawei
}

class Processor {
    private String model;
    private double GHZ;

    public Processor(String model, double GHZ) {
        this.model = model;
        this.GHZ = GHZ;
    }

    public String getModel() {
        return model;
    }

    public double getGHz() {
        return GHZ;
    }
}

// Класс, описывающий оперативную память
class Memory {
    private int size;

    public Memory(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}

// Класс, описывающий монитор
class Monitor {
    private String model;
    private double size;

    public Monitor(String model, double size) {
        this.model = model;
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public double getSize() {
        return size;
    }
}

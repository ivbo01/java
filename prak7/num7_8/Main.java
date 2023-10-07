package prak7.num7_8;

// Интерфейс для объектов, которые можно распечатать
interface Printable {
    String getTitle();
}

class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    // Создать статический метод printMagazines(Printable[] printable) в классе Magazine, который выводит на консоль названия только журналов.
    public static void printMagazines(Printable[] printable) {
        for (Printable i: printable) {
            if (i instanceof Magazine) {
                System.out.println(i.getTitle());
            }
        }
    }
}

class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    // Создать статический метод printBooks(Printable[] printable) в классе Book, который выводит на консоль названия только книг. Используем оператор instanceof.
    public static void printBooks(Printable[] printable) {
        for (Printable i: printable) {
            if (i instanceof Book) {
                System.out.println(i.getTitle());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Printable[] arr1 = new Printable[4];
        arr1[0] = new Magazine("Журнал 1");
        arr1[1] = new Book("Книга 1");
        arr1[2] = new Magazine("Журнал 2");
        arr1[3] = new Book("Книга 2");

        Magazine.printMagazines(arr1);
        Book.printBooks(arr1);
    }
}

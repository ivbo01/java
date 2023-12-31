Механизм наследования очень удобен, но он имеет свои ограничения. В частности, мы можем наследовать только от одного класса, в отличие, например, от языка С++, где имеется множественное наследование.

```java
public interface Printable{
  void print();
}
```

И также при объявлении интерфейса надо учитывать, что только один интерфейс в файле может иметь тип доступа public. А его название должно совпадать с именем файла. Остальные интерфейсы (если такие имеются в файле java) не должны иметь модификаторов доступа.

```java
class Book implements Printable {
  String name;
  String author;
  int year;
  Book(String name, String author, int year) {
    this.name = name;
    this.author = author; this.year = year;
  }
  public void print() {
    System.out.printf("Книга '%s' (автор %s) была издана в %d году \n", name, author, year);}
}
```

В тоже время мы не можем напрямую создавать объекты интерфейсов, поэтому следующий код не будет работать:

```java
Printable pr = new Printable();
pr.print();
```

И также, как и в случае с классами, интерфейсы могут использоваться в качестве типа параметров метода или в качестве возвращаемого типа:

```java
public static void main(String[] args) {
    Printable printable = createPrintable("Компьютерра", false);
    printable.print();
    read(new Book("Отцы и дети", "И. Тургенев", 1862));
    read(new Journal("Хакер"));
}

// Статический метод класса
static void read(Printable p) {
    p.print();
}

// Статический метод
static Printable createPrintable(String name, boolean option) {
    if (option)
        return new Book(name, "неизвестен", 2015);
    else
        return new Journal(name);
}
```

Метод read() в качестве параметра принимает объект интерфейса Printable, поэтому в этот метод мы можем передать как объект Book, так и объект Journal.

Метод createPrintable() возвращает объект Printable, поэтому также мы можем возвратить как объект Book, так и Journal.

### Статические методы интерфейса
Интерфейс Java может иметь статические методы. Статические методы в интерфейсе Java должны иметь реализацию, в отличие от обычных методов.

```java
public interface MyInterface {
  public static void print (String text) {
    System.out.print (текст);
  }
}
```

Статические методы в интерфейсах могут быть полезны, когда у вас есть некоторые служебные методы, которые вы хотели бы сделать доступными, которые естественным образом вписываются в интерфейс, связанный с той же ответственностью.

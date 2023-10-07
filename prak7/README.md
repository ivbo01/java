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

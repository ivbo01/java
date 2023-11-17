## Comparator
Comparator — это интерфейс в Java, предназначенный для сравнения объектов. Он содержит метод compare, который принимает два объекта и возвращает отрицательное число, ноль или положительное число в зависимости от того, как соотносятся эти объекты.


Comparable и Comparator в Java предоставляют способы сравнения объектов, но они используются в разных контекстах.

Comparable:
- Интерфейс Comparable используется для добавления сравнения к объектам и позволяет классу сравнивать свои экземпляры.
- Класс, реализующий Comparable, должен предоставить реализацию метода compareTo(Object obj).
- С использованием Comparable объекты можно сортировать с помощью Arrays.sort() или Collections.sort() без явного указания компаратора

Comparator:
- Интерфейс Comparator предоставляет более гибкий подход к сравнению объектов, так как позволяет создавать отдельные классы или анонимные классы для сравнения объектов.
- Классы, реализующие Comparator, должны предоставить реализацию метода compare(T obj1, T obj2).
- С использованием Comparator можно сортировать объекты по разным критериям без изменения основного класса.

```java
public interface Comparator<E> { 
    int compare(T a, T b); 
    // остальные методы 
}
```

```java
class PersonComparator implements Comparator<Person> { 
    public int compare(Person a, Person b) { 
        return a.getName().compareTo(b.getName()); 
    } 
}
```

Выбор между Comparable и Comparator зависит от ситуации. Если у вас есть контроль над кодом класса и сравнение всегда однозначно, то Comparable может быть более удобным. Если же вы хотите предоставить несколько способов сравнения для одного класса, то Comparator предоставляет более гибкий подход.


### Сортировка по нескольким критериям 
Теперь мы можем применять сразу несколько  компараторов  по  принципу  приоритета.  Например,  изменим класс Person следующим образом:
```java
class Person { 
    private String name; 
    private int age; 
    public Person(String  name, int age) { 
        this.name = name; 
        this.age = age; 
    } 
    String getName() {
        return name;
    } 
    int getAge() {
        return age;
    } 
} 

```

Здесь  добавлено  поле  для  хранения  возраста  пользователя.  И,  допустим, нам надо отсортировать пользователей по имени и по возрасту. Для этого определим два компаратора:

```java
class PersonNameComparator implements  Comparator<Person> { 
    public int compare(Person a, Person b) { 
        return a.getName().compareTo(b.getName()); 
    } 
}
```

```java
class PersonAgeComparator implements Comparator<Person> { 
    public int compare(Person a, Person b) {
        if (a.getAge() > b.getAge())
            return 1; 
        else if (a.getAge() < b.getAge()) 
            return -1; 
        else 
            return 0; 
    } 
}
```
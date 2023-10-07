Swing в Джава — это набор инструментов графического интерфейса пользователя (GUI), который включает компоненты GUI.

Swing является частью Java Foundation Classes (JFC), который представляет собой API для программирования Java GUI, который предоставляет GUI. Библиотека Java Swing построена на основе Java Abstract Widget Toolkit (AWT), более старого, зависящего от платформы инструментария графического интерфейса пользователя.

![image](https://github.com/ivbo01/java/assets/144561607/30808223-c7d0-4197-be74-adfeb3c72a1d)

Все компоненты в Java Swing — это JComponent, который можно добавлять в классы-контейнеры.

Классы-контейнеры — это классы, на которых могут быть другие компоненты. Итак, для создания графического интерфейса Java Swing нам понадобится хотя бы один объект-контейнер. Существует три типа контейнеров Java Swing:
- JPanel (Панель): это чистый контейнер, а не окно. Единственная цель Panel - организовать компоненты в окне.
- JFrame (Фрейм ): это полностью функционирующее окно со своим заголовком и значками.
- JDialog (Диалог): это можно представить как всплывающее окно, которое выскакивает, когда необходимо отобразить сообщение. Это не полностью функционирующее окно, как Frame.

```java
import javax.swing.*;

class FirstGui {
    public static void main(String args[]) {
        // Создаем фрейм окна с помощью конструктора
        // Конструктор берет параметр - название окна - это строка
        JFrame frame = new JFrame("My First GUI");
        
        // Устанавливаем реакцию окна на закрытие по умолчанию
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Задаем свойства окна - его размеры в пикселях
        frame.setSize(300, 300);
        
        // Создаем кнопку с помощью конструктора класса JButton
        // Конструктор берет параметр строку - название на кнопке
        JButton button = new JButton("Press");
        
        // Добавляем кнопку к окну
        frame.getContentPane().add(button);
        
        // Делаем окно видимым
        frame.setVisible(true);
    }
}
```

```java
import javax.swing.*;

class SecondGui {
    public static void main(String args[]) {
        // Создаем фрейм окна с помощью конструктора
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        // Создаем две кнопки
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        // Добавляем кнопки на контентную панель окна
        frame.getContentPane().add(button1);
        frame.getContentPane().add(button2);

        // Делаем окно видимым
        frame.setVisible(true);
    }
}
```

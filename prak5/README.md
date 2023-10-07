Swing в Джава — это набор инструментов графического интерфейса пользователя (GUI), который включает компоненты GUI.

Swing является частью Java Foundation Classes (JFC), который представляет собой API для программирования Java GUI, который предоставляет GUI. Библиотека Java Swing построена на основе Java Abstract Widget Toolkit (AWT), более старого, зависящего от платформы инструментария графического интерфейса пользователя.

![image](https://github.com/ivbo01/java/assets/144561607/30808223-c7d0-4197-be74-adfeb3c72a1d)

Все компоненты в Java Swing — это JComponent, который можно добавлять в классы-контейнеры.

### Классы-контейнеры
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

Мы видим на рисунке только вторую кнопку. Дело в том, что приложение имеет многослойную структуру и следующий компонент, который мы добавили закрывает или наслаивается н предыдущий. Для того чтобы избежать этого эффекта нужно использовать контейнеры для организации компонентов и менеджеры компоновки. Добавим к нашему коду объект класса JPanel, он использует менеджер компоновки по умолчанию. Но вы можете изменить его с помощью метода setLayout().

```java
import java.awt.*;
import javax.swing.*;

public class ThirdGui {
    public static void main(String args[]) {
        // Создаем фрейм окна с помощью конструктора
        JFrame frame = new JFrame("My Second GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);

        // Создаем панель
        JPanel panel = new JPanel();
        
        // Задаем свойства панели: цвет фона и размеры
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(200, 300));

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        panel.add(button1);
        panel.add(button2);

        // Добавляем панель на контентную панель окна
        frame.getContentPane().add(panel);
        
        // Упаковываем компоненты во фрейм
        frame.pack();
        
        // Делаем окно видимым
        frame.setVisible(true);
    }
}
```

Два объекта класса JButton будут добавляться последовательно один за другим, том порядке в котором они были добавлены с помощью метода add в программе, поскольку в данном случае используется менеджер компоновки по умолчанию. Если вы хотите изменить расположение объектов используйте менеджеры компоновки и их сочетания. Изменить можно с помощью метода setLayout.

### Класс JLabel
JLabel это область для отображения короткой строки, изображения или того и другого. Обычно объекты JLabel добавляются на панели. При добавлении следующего кода Java после создания JFrame создается надпись с текстом “I'm a JLabel”. Пример кода:

```java
JLabel label = new JLabel("I'm a JLabel", JLabel.CENTER);
frame.add(label);
```

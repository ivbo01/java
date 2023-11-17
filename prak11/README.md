В стандартной библиотеке Java существует класс Date, который предоставляет возможности для работы с датой и временем. Однако стоит отметить, что этот класс устарел и не рекомендуется для новых проектов. Вместо него рекомендуется использовать пакет java.time, который предоставляет более современные и удобные средства для работы с датой и временем.

```java
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        // Создание объекта Date, который представляет текущую дату и время
        Date currentDate = new Date();
        System.out.println("Current Date and Time: " + currentDate);

        // Получение времени в миллисекундах
        long currentTimeInMillis = currentDate.getTime();
        System.out.println("Current Time in Milliseconds: " + currentTimeInMillis);

        // Создание объекта Date на основе времени в миллисекундах
        Date anotherDate = new Date(currentTimeInMillis + 86400000); // добавим 24 часа
        System.out.println("Another Date and Time: " + anotherDate);
    }
}
```


Calendar и GregorianCalendar являются частями стандартной библиотеки Java и предоставляют функциональность для работы с датой и временем. Однако, также стоит отметить, что эти классы могут считаться устаревшими, и для новых проектов рекомендуется использовать пакет java.time, представленный в Java 8 и более поздних версиях.

```java
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExample {
    public static void main(String[] args) {
        // Использование Calendar для получения текущей даты и времени
        Calendar calendar = Calendar.getInstance();
        System.out.println("Current Date and Time: " + calendar.getTime());

        // Использование GregorianCalendar для создания конкретной даты
        GregorianCalendar gregorianCalendar = new GregorianCalendar(2023, Calendar.OCTOBER, 26);
        System.out.println("Specific Date: " + gregorianCalendar.getTime());

        // Добавление или вычитание времени
        gregorianCalendar.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println("Date after adding 5 days: " + gregorianCalendar.getTime());

        // Получение значений (год, месяц, день и т.д.)
        int year = gregorianCalendar.get(Calendar.YEAR);
        int month = gregorianCalendar.get(Calendar.MONTH); // обратите внимание, что месяцы в Calendar начинаются с 0
        int day = gregorianCalendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("Year: " + year);
        System.out.println("Month: " + (month + 1)); // добавляем 1, чтобы согласовать с человеческим представлением месяцев
        System.out.println("Day: " + day);
    }
}
```

Листинг из файла:

```java
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2002);
        cal.set(Calendar.MONTH, Calendar.AUGUST);
        cal.set(Calendar.DAY_OF_MONTH, 31);

        System.out.println(" Initially set date: " + sdf.format(cal.getTime()));

        cal.set(Calendar.MONTH, Calendar.SEPTEMBER);
        System.out.println(" Date with month changed: " + sdf.format(cal.getTime()));

        cal.set(Calendar.DAY_OF_MONTH, 30);
        System.out.println(" Date with day changed: " + sdf.format(cal.getTime()));
    }
}

// Initialy set date: 2002 August 31 22:57:47 
// Date with month changed: 2002 October 01 22:57:47 
// Date with day changed: 2002 October 30 22:57:47
```

```java
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("toString(): " + now);
        // Формат строки по умолчанию: "dow mon dd hh:mm:ss zzz yyyy"

        // SimpleDateFormat используется для управления форматом отображения даты/времени.

        // Формат 1:
        // E (день недели): 3E or fewer (в текстовом формате xxx), >3E (в полном текстовом формате)
        // y (год), M (месяц): M (в числовом виде), MM (в числовом виде, с ведущим нулем)
        // d (день), h (часы): h, hh (с ведущим нулем)
        // m (минуты), s (секунды), a (AM/PM), z (временная зона)
        SimpleDateFormat dateFormatter1 = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
        System.out.println("Format 1:   " + dateFormatter1.format(now));

        // Формат 2:
        // Включает те же компоненты, что и Format 1, но с другим порядком и разделителями.
        SimpleDateFormat dateFormatter2 = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Format 2:   " + dateFormatter2.format(now));

        // Формат 3:
        // Полное название дня недели (EEEE), полное название месяца (MMMM), число месяца (d), год (yyyy).
        SimpleDateFormat dateFormatter3 = new SimpleDateFormat("EEEE, MMMM d, yyyy");
        System.out.println("Format 3:   " + dateFormatter3.format(now));
    }
}

// toString(): Sat Sep 25 21:27:01 SGT 2010 
// Format 1:   Sat, 10-9-25 at 9:27:1 PM SGT 
// Format 2:   Sat 2010.09.25 at 09:27:01 PM SGT 
// Format 3:   Saturday, September 25, 2010
```

### Классы java.util.Calendar и java.util.GregorianCalendar 
java.util.Calendar:
- Это абстрактный класс, предоставляющий календарные функции.
- Класс предоставляет базовый функционал для работы с датами, включая управление полями (год, месяц, день и т.д.), а также выполнение арифметических операций с датами.
- Он является суперклассом для конкретных реализаций календарей, таких как GregorianCalendar.

java.util.GregorianCalendar:
- Это конкретная реализация класса Calendar.
- GregorianCalendar предоставляет реализацию календаря в соответствии с григорианским календарем, который является широко используемым календарем в мире.
- Он поддерживает более широкий диапазон дат и времени, чем класс Calendar, и предоставляет дополнительные методы для работы с годами, месяцами и днями недели.

```java
import java.util.Calendar;

public class GetYMDHMS {
    public static void main(String[] args) {
        // Получаем экземпляр Calendar, представляющий текущую дату и время
        Calendar cal = Calendar.getInstance();

        // Извлекаем отдельные компоненты даты и времени
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);  // Месяцы считаются с 0 до 11
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        // Выводим информацию о текущей дате и времени
        System.out.printf("Now is %4d/%02d/%02d %02d:%02d:%02d\n", year, month + 1, day, hour, minute, second);
    }
}

```
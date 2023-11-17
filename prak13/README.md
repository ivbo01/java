Обратитесь  к  API  JDK  для  того  чтобы  ознакомиться  с  полным  списком  возможностей  класса  String  в    java.lang.String.  Наиболее  часто  используемые методы класса String приведены ниже.

```java
int length()                    // возвращает длину String 
boolean isEmpty()               // то же, что и thisString.length() == 0 

// Сравнение 
boolean equals(String another)  // Нельзя использовать '==' или '!=' для сравнения объектов String в Java 
boolean equalsIgnoreCase(String another) 
int compareTo(String another)    // возвращает 0, если эта строка совпадает с another;
                                // <0, если лексикографически меньше another; или >0
int compareToIgnoreCase(String another) 
boolean startsWith(String prefix) 
boolean startsWith(String prefix, int fromIndex)  // Поиск начинается с fromIndex 
boolean endsWith(String suffix) 

// Поиск и индексирование 
int indexOf(String search) 
int indexOf(String search, int fromIndex) 
int indexOf(int character) 
int indexOf(int character, int fromIndex)      // Поиск вперед от fromIndex 
int lastIndexOf(String search) 
int lastIndexOf(String search, int fromIndex)  // Поиск назад от fromIndex 
int lastIndexOf(int character) 
int lastIndexOf(int character, int fromIndex) 

// Выделение char или части строки из String (подстрока) 
char charAt(int index)              // Позиция от 0 до (длина строки-1) 
String substring(int fromIndex) 
String substring(int fromIndex, int endIndex)  // Исключая endIndex 

// Создается новый String или char[] из исходного (Strings не изменяются!) 
String toLowerCase()               // Преобразование к нижнему регистру 
String toUpperCase()               // Преобразование к верхнему регистру 
String trim()                      // Создается новый String с удалением пробелов спереди и сзади  
String replace(char oldChar, char newChar)   // Создание нового String, старый oldChar заменяется newChar 
String concat(String another)      // То же самое как thisString + другое 
char[] toCharArray()               // Создается char[] из string 
void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)   // Копируется в массив назначения dst char[]

// Статические методы для преобразования примитивов в String 
static String valueOf(type arg)   // Тип может быть примитивный или char[] 

// Статические методы дают форматированный String, используя спецификаторы форматирования  
static String format(String formattingString, Object... args)   // Также как printf()

// Регулярные выражения (JDK 1.4) 
boolean matches(String regex) 
String replaceAll(String regex, String replacement) 
String[] split(String regex)       // Разделяет String, используя regex как разделитель, возвращает массив String 
String[] split(String regex, int count)   // Для подсчета количества раз только (count)
```

### Статический метод String.format()
```java
public class Filename {
    private String fullPath;
    private char pathSeparator, extensionSeparator;

    public Filename(String str, char sep, char ext) {
        fullPath = str;
        pathSeparator = sep;
        extensionSeparator = ext;
    }

    public String extension() {
        int dot = fullPath.lastIndexOf(extensionSeparator);
        return fullPath.substring(dot + 1);
    }

    // Получение имени файла без расширения
    public String filename() {
        int dot = fullPath.lastIndexOf(extensionSeparator);
        int sep = fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(sep + 1, dot);
    }

    public String path() {
        int sep = fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(0, sep);
    }
}
```

```java
public class Main{ 
    public static void main(String[] args) { 
        final String FPATH = "/home/user/index.html"; 
        Filename myHomePage = new Filename(FPATH,  '/', '.'); 
        System.out.println("Extension = " + myHomePage.extension()); 
        System.out.println("Filename = " + myHomePage.filename()); 
        System.out.println("Path = " + myHomePage.path()); 
    } 
}
```

```java
Extension = html 
Filename = index 
Path = /home/user
```
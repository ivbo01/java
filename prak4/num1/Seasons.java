// Создать перечисление, содержащее названия времен года.
public enum Seasons {
    // 3) Перечисление должно содержать переменную, содержащую среднюю температуру в каждом времени года.
    Зима(-5),   // Средняя температура зимой
    Весна(15),   // Средняя температура весной
    Лето(25),   // Средняя температура летом
    Осень(10);   // Средняя температура осенью

    private final int averageTemperature; // Переменная для средней температуры

    Seasons(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }
    // 5) Создать метод getDescription, возвращающий строку “Холодное время года”.
    // Переопределить метод getDescription - для константы Лето метод должен возвращать “Теплое время года”.
    public String getDescription() {
        if (this == Лето) {
            return "Теплое время года";
        } else {
            return "Холодное время года";
        }
    }
    
    public static void main(String[] args) {
        // 1) Создать переменную, содержащую ваше любимое время года и распечатать всю информацию о нем
        Seasons favoriteSeason = Seasons.Весна;
        System.out.println("Мое любимое время года: " + favoriteSeason);
        
        // 2) Создать метод, который принимает на вход переменную созданного вами enum типа.
        // Если значение равно Лето, выводим на консоль “Я люблю лето” и так далее. Используем оператор switch.
        Seasons iLoveSeason = Seasons.Весна;
        printFavoriteSeason(iLoveSeason);
        
        // 6) В цикле распечатать все времена года, среднюю температуру и описание времени года
        for (Seasons season: Seasons.values()) {
            System.out.println(season + ": " + "temp = " + season.getAverageTemperature() + " " + season.getDescription());
        }
    }
    
    public static void printFavoriteSeason(Seasons season) {
        switch (season) {
            case Зима:
                System.out.println("Я люблю зиму");
                break;
            case Весна:
                System.out.println("Я люблю весну");
                break;
            case Лето:
                System.out.println("Я люблю лето");
                break;
            case Осень:
                System.out.println("Я люблю осень");
                break;
        }
    }
}

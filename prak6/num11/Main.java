package prak6.num11;

interface Convertable {
    double convert(double temperature);
}

class TemperatureConverter implements Convertable {
    public double convertKelvin(double celsius) {
        return celsius + 273.15;
    }

    public double convertFahren(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    @Override
    public double convert(double temperature) {
        return temperature;
    }
}

public class Main {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        double celsius = 1.0;
        double kelvin = converter.convertKelvin(celsius);
        double fahrenheit = converter.convertFahren(celsius);

        System.out.println(celsius + " градус Цельсия = " + kelvin + " по Кельвин");
        System.out.println(celsius + " градус Цельсия = " + fahrenheit + " по Фаренгейту");
    }
}

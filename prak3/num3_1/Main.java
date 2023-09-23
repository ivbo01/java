import java.util.Scanner;
// Создать класс конвертор валют.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сумма и валюта для конвертации (100 USD): ");
        String input_str = scanner.nextLine();

        String[] parts = input_str.split(" ");
        String input_sum = parts[0];
        String input_currency = parts[1].toUpperCase();
        
        double amount = Double.parseDouble(input_sum);

        System.out.println("Валюта, в которую конвертируем (USD, EUR, RUB): ");
        String output_currency = scanner.nextLine().toUpperCase();

        double convertedAmount = 0;

        if (input_currency.equals("USD") && output_currency.equals("RUB")) {
            convertedAmount = amount * 96.0;
        } else if (input_currency.equals("EUR") && output_currency.equals("RUB")) {
            convertedAmount = amount * 102.0; 
        } else if (input_currency.equals("EUR") && output_currency.equals("USD")) {
            convertedAmount = amount * 1.07;
        } else if (input_currency.equals("RUB") && output_currency.equals("USD")) {
            convertedAmount = amount / 96.0;
        } else if (input_currency.equals("RUB") && output_currency.equals("EUR")) {
            convertedAmount = amount / 102.0;
        } else if (input_currency.equals("USD") && output_currency.equals("EUR")) {
            convertedAmount = amount / 1.07;
        } else {
            System.out.println("Конвертация недоступна.");
        }

        System.out.println(input_sum + " " + input_currency + " равно " + convertedAmount + " " + output_currency);
    }
}
import java.util.Scanner;

public class CelsiusToFahrenheit_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = Double.parseDouble(scanner.nextLine());
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.printf("%.2f", fahrenheit);
    }
}
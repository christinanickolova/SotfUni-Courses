import java.util.PrimitiveIterator;
import java.util.Scanner;

public class TruckDriver_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double kilometersPerMonth = Double.parseDouble(scanner.nextLine());
        double pricePerKilometer = 0;
        double taxes = 0;
        double salary = 0;
        switch (season) {
            case "Spring":
            case "Autumn":
                if (kilometersPerMonth <= 5000) {
                    pricePerKilometer = 0.75;
                } else if (kilometersPerMonth <= 10000) {
                    pricePerKilometer = 0.95;
                } else {
                    pricePerKilometer = 1.45;
                }
                break;
            case "Summer":
                if (kilometersPerMonth <= 5000) {
                    pricePerKilometer = 0.9;
                } else if (kilometersPerMonth <= 10000) {
                    pricePerKilometer = 1.1;
                } else {
                    pricePerKilometer = 1.45;
                }
                break;
            case "Winter":
                if (kilometersPerMonth <= 5000) {
                    pricePerKilometer = 1.05;
                } else if (kilometersPerMonth <= 10000) {
                    pricePerKilometer = 1.25;
                } else {
                    pricePerKilometer = 1.45;
                }
                break;

        }
        double totalKilometers = pricePerKilometer * kilometersPerMonth * 4;
        taxes = totalKilometers * 0.1;
        salary = totalKilometers - taxes;
        System.out.printf("%.2f", salary);
    }
}
import java.util.Scanner;

public class Fishland_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mackerelsPricePerKg = Double.parseDouble(scanner.nextLine());
        double spratsPricePerKg = Double.parseDouble(scanner.nextLine());
        double bonitoKg = Double.parseDouble(scanner.nextLine());
        double scadKg = Double.parseDouble(scanner.nextLine());
        int musselsKg = Integer.parseInt(scanner.nextLine());
        double bonitoPrice = (mackerelsPricePerKg + (mackerelsPricePerKg * 0.6)) * bonitoKg;
        double scadPrice = (spratsPricePerKg + (spratsPricePerKg * 0.8)) * scadKg;
        double musselsPrice = musselsKg * 7.5;
        double totalPrice = bonitoPrice + scadPrice + musselsPrice;
        System.out.printf("%.2f", totalPrice);
    }
}
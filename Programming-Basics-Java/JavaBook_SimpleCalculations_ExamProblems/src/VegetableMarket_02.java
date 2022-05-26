import java.util.Scanner;

public class VegetableMarket_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vegPricePerKg = Double.parseDouble(scanner.nextLine());
        double fruitsPricePerKg = Double.parseDouble(scanner.nextLine());
        int vegTotalKg = Integer.parseInt(scanner.nextLine());
        int fruitsTotalKg = Integer.parseInt(scanner.nextLine());
        double vegPriceInLv = vegPricePerKg * vegTotalKg;
        double fruitsPriceInLv = fruitsPricePerKg * fruitsTotalKg;
        System.out.println((vegPriceInLv + fruitsPriceInLv) / 1.94);
    }
}
import java.util.Scanner;

public class Harvest_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int x = Integer.parseInt(scanner.nextLine());
            double y = Double.parseDouble(scanner.nextLine());
            int z = Integer.parseInt(scanner.nextLine());
            int workers = Integer.parseInt(scanner.nextLine());
            double wineArea = x * 0.4;
            double grapeExtract = wineArea * y;
            double wineExtract = grapeExtract / 2.5;
            if (wineExtract < z) {
                System.out.printf("It will be a tough winter! More %.0f liters wine needed.",
                        Math.floor(z - wineExtract));
            } else {
                System.out.printf("Good harvest this year! Total wine: %.0f liters. %n%.0f liters left -> %.0f liters per person.", Math.floor(wineExtract),
                        Math.ceil(wineExtract - z),
                        Math.ceil((wineExtract - z) / workers));
            }
    }
}
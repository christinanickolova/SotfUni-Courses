import java.util.Scanner;

public class Logistics_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cargos = Integer.parseInt(scanner.nextLine());
        int minibus = 0;
        int truck = 0;
        int train = 0;
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double price = 0;
        double average = 0;
        double averagePrice = 0;
        for (int i = 1; i <= cargos; i++) {
            int tons = Integer.parseInt(scanner.nextLine());
            if (tons <= 3) {
                minibus += tons;
            } else if (tons <= 11) {
                truck += tons;
            } else {
                train += tons;
            }
            average += tons;
        }
        averagePrice = ((minibus * 200) + (truck * 175) + (train * 120)) / average;
        p1 = minibus / average * 100;
        p2 = truck / average * 100;
        p3 = train / average * 100;
        System.out.printf("%.2f%n", averagePrice);
        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%", p3);
    }
}
import java.util.Scanner;

public class Profit_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oneLevCoins = Integer.parseInt(scanner.nextLine());
        int twoLevCoins = Integer.parseInt(scanner.nextLine());
        int fiveLevBills = Integer.parseInt(scanner.nextLine());
        int amount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= oneLevCoins; i++) {
            for (int j = 0; j <= twoLevCoins; j++) {
                for (int k = 0; k <= fiveLevBills; k++) {
                    if (((i * 1) + (j * 2) + (k * 5)) == amount) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j, k, amount);
                    }
                }
            }
        }
    }
}
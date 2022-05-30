import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());
        int yieldAmount = 0;
        int days = 0;
        while (startingYield >= 100) {
            yieldAmount += (startingYield - 26);
            days++;
            startingYield -= 10;
        }
        System.out.println(days);
        if (yieldAmount >= 26) {
            yieldAmount -= 26;
        }
        System.out.println(yieldAmount);
    }
}

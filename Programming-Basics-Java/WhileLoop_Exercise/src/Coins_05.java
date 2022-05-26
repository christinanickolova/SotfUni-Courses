import java.util.Scanner;

public class Coins_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double change = Double.parseDouble(scanner.nextLine());
        double changeInCoins = change * 100;
        int count = 0;
        while (changeInCoins > 0) {
            if (changeInCoins >= 200) {
                count++;
                changeInCoins -= 200;
            } else if (changeInCoins >= 100) {
                count++;
                changeInCoins -= 100;
            } else if (changeInCoins >= 50) {
                count++;
                changeInCoins -= 50;
            } else if (changeInCoins >= 20) {
                count++;
                changeInCoins -= 20;
            } else if (changeInCoins >= 10) {
                count++;
                changeInCoins -= 10;
            } else if (changeInCoins >= 5) {
                count++;
                changeInCoins -= 5;
            } else if (changeInCoins >= 2) {
                count++;
                changeInCoins -= 2;
            } else if (changeInCoins >= 1) {
                count++;
                changeInCoins -= 1;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
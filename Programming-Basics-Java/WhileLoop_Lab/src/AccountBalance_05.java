import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalMoney = 0;
        String text = scanner.nextLine();
        while (!text.equals("NoMoreMoney")) {
            double sum = Double.parseDouble(text);
            if (sum < 0) {
                System.out.println("Invalid operation!");
                break;
            } else {
                totalMoney += sum;
                System.out.printf("Increase: %.2f%n", sum);
            }
            text = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", totalMoney);
    }
}
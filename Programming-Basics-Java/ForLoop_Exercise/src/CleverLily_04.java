import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int pricePerToy = Integer.parseInt(scanner.nextLine());
        int money = 0;
        int toysCount = 0;
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= years; i++) {
            if (i % 2 == 0) {
                money += 10;
                sum += money;
                count++;
            } else {
                toysCount++;
            }
        }
        double moneyFromToys = toysCount * pricePerToy;
        double total = (sum + moneyFromToys) - count;
        if (total >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", total - washingMachinePrice);
        } else {
            System.out.printf("No! %.2f", washingMachinePrice - total);
        }
    }
}
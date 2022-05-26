import java.util.Scanner;

public class ChangeBureau_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bitcoins = Integer.parseInt(scanner.nextLine());
        double yuan = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());
        double bitcoinsInEuro = 1168 / 1.95;
        double yuanInEuro = (0.15 * 1.76) / 1.95;
        double totalEuro = (bitcoinsInEuro * bitcoins) + (yuanInEuro * yuan);
        double total = totalEuro - (totalEuro * commission / 100);
        System.out.printf("%.2f", total);
    }
}
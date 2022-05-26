import java.util.Scanner;

public class Money_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bitcoins = Double.parseDouble(scanner.nextLine());
        double yuans = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());
        double bitcoinsInLevs = bitcoins * 1168;
        double yuansInDollars= yuans * 0.15;
        double yuansInLevs = yuansInDollars * 1.76;
        double euros = (bitcoinsInLevs + yuansInLevs) / 1.95;
        double commissionPrice = euros * commission / 100;
        System.out.println(euros - commissionPrice);
    }
}
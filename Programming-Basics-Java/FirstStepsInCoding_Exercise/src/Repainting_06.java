import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylonNeeded = Integer.parseInt(scanner.nextLine());
        int paintNeeded = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double nylonPrice = (nylonNeeded + 2) * 1.5;
        double paintPrice = (paintNeeded + (paintNeeded * 0.1)) * 14.5;
        int thinnerPrice = thinner * 5;
        double bagsPrice = 0.4;
        double totalPrice = nylonPrice + paintPrice + thinnerPrice + bagsPrice;
        double totalPriceForWorkers = (totalPrice * 0.3) * hours;
        double finalPrice = totalPrice + totalPriceForWorkers;
        System.out.println(finalPrice);
    }
}
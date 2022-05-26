import java.util.Scanner;

public class Excursion_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleInGroupCount = Integer.parseInt(scanner.nextLine());
        int sleepOversCount = Integer.parseInt(scanner.nextLine());
        int transportCardsCount = Integer.parseInt(scanner.nextLine());
        int museumTickets = Integer.parseInt(scanner.nextLine());
        int sleepOverTotalPrice = sleepOversCount * 20;
        double transportTotalPrice = transportCardsCount * 1.6;
        int museumTotalPrice = museumTickets * 6;
        double totalPrice = sleepOverTotalPrice + transportTotalPrice + museumTotalPrice;
        double totalPriceForGroup = totalPrice * peopleInGroupCount;
        double finalPrice = totalPriceForGroup + (totalPriceForGroup * 0.25);
        System.out.printf("%.2f", finalPrice);
    }
}
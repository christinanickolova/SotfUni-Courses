import java.util.Scanner;

public class MatchTickets_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int peopleCount = Integer.parseInt(scanner.nextLine());
        double transport = 0;
        double ticketPrice = 0;
        if (peopleCount >= 1 && peopleCount <= 4) {
            transport = budget * 0.75;
            budget -= transport;
        } else if (peopleCount >= 5 && peopleCount <= 9) {
            transport = budget * 0.6;
            budget -= transport;
        } else if (peopleCount >= 10 && peopleCount <= 24) {
            transport = budget * 0.5;
            budget -= transport;
        } else if (peopleCount >= 25 && peopleCount <= 49) {
            transport = budget * 0.4;
            budget -= transport;
        } else if (peopleCount >= 50) {
            transport = budget * 0.25;
            budget -= transport;
        }
        if (category.equals("VIP")) {
            ticketPrice = 499.99 * peopleCount;
            if (ticketPrice > budget) {
                System.out.printf("Not enough money! You need %.2f leva.", ticketPrice - budget);
            } else {
                System.out.printf("Yes! You have %.2f leva left.", budget - ticketPrice);
            }
        } else if (category.equals("Normal")) {
            ticketPrice = 249.99 * peopleCount;
            if (ticketPrice > budget) {
                System.out.printf("Not enough money! You need %.2f leva.", ticketPrice - budget);
            } else {
                System.out.printf("Yes! You have %.2f leva left.", budget - ticketPrice);
            }
        }
    }
}
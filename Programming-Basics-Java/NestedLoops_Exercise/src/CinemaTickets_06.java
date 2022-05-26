import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double studentTickets = 0;
        double standardTickets = 0;
        double kidsTickets = 0;
        double studentCurrentTickets = 0;
        double standardCurrentTickets = 0;
        double kidsCurrentTickets = 0;
        double hallCapacity = 0;
        String movie = "";
        double totalTickets = 0;
        String input = scanner.nextLine();
        while (!input.equals("Finish")) {
            movie = input;
            int freeSeats = Integer.parseInt(scanner.nextLine());
            standardTickets = 0;
            studentTickets = 0;
            kidsTickets = 0;
            while (!input.equals("End")) {
                if (input.equals("student")) {
                    studentCurrentTickets++;
                    studentTickets++;
                } else if (input.equals("standard")) {
                    standardCurrentTickets++;
                    standardTickets++;
                } else if (input.equals("kid")) {
                    kidsCurrentTickets++;
                    kidsTickets++;
                }
                totalTickets = standardTickets + studentTickets + kidsTickets;
                if (totalTickets >= freeSeats) {
                    break;
                }
                input = scanner.nextLine();
            }
            hallCapacity = totalTickets / freeSeats * 100;
            System.out.printf("%s - %.2f%% full.%n", movie, hallCapacity);
            input = scanner.nextLine();
        }
        double finalTickets = studentCurrentTickets + standardCurrentTickets + kidsCurrentTickets;
        System.out.printf("Total tickets: %.0f%n", finalTickets);
        System.out.printf("%.2f%% student tickets.%n", studentCurrentTickets / finalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardCurrentTickets / finalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", kidsCurrentTickets / finalTickets * 100);
    }
}
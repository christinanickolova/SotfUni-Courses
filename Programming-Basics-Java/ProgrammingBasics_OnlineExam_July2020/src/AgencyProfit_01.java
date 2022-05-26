import java.util.Scanner;

public class AgencyProfit_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String company = scanner.nextLine();
        int adultTickets = Integer.parseInt(scanner.nextLine());
        int kidsTickets = Integer.parseInt(scanner.nextLine());
        double netPriceForAdultTicket = Double.parseDouble(scanner.nextLine());
        double serviceTax = Double.parseDouble(scanner.nextLine());
        double discount = netPriceForAdultTicket * 0.7;
        double netPriceForKidTicket = netPriceForAdultTicket - discount;
        double finalPriceForAdultTicket = netPriceForAdultTicket + serviceTax;
        double finalPriceForKidTicket = netPriceForKidTicket + serviceTax;
        double sum = (finalPriceForAdultTicket * adultTickets) + (finalPriceForKidTicket * kidsTickets);
        double profit = sum * 0.2;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", company, profit);
    }
}
import java.util.Scanner;

public class Bills_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int months = Integer.parseInt(scanner.nextLine());
        double electricity = 0;
        double water = 0;
        double internet = 0;
        double others = 0;
        double average = 0;
        for (int i = 0; i < months; i++) {
            double electricityBill = Double.parseDouble(scanner.nextLine());
                others += ((electricityBill + 35) + (electricityBill + 35) * 0.2);
                electricity += electricityBill;
                water += 20;
                internet += 15;
        }
        average = (electricity + water + internet + others) / months;
        System.out.printf("Electricity: %.2f lv%n", electricity);
        System.out.printf("Water: %.2f lv%n", water);
        System.out.printf("Internet: %.2f lv%n", internet);
        System.out.printf("Other: %.2f lv%n", others);
        System.out.printf("Average: %.2f lv", average);
    }
}
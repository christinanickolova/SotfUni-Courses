import java.util.Scanner;

public class Firm_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        double training = days * 0.1;
        double workingHours = (days - training) * 8;
        double overtimeWork = days * 2 * workers;
        double totalHours = Math.floor(workingHours + overtimeWork);
        if (totalHours >= hours) {
            System.out.printf("Yes!%.0f hours left.", totalHours - hours);
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", hours - totalHours);
        }
    }
}
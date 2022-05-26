import java.lang.management.MonitorInfo;
import java.util.Scanner;

public class TimePlus15Minutes_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        if (minutes <= 44) {
            minutes += 15;
            System.out.printf("%d:%d", hours, minutes);
        } else {
            minutes += 15 - 60;
            if (hours < 23 && minutes >= 10) {
                hours += 1;
                System.out.printf("%d:%d", hours, minutes);
            } else if (hours < 23 && minutes < 10) {
                hours += 1;
                System.out.printf("%d:0%d", hours, minutes);
            } else if (hours == 23 && minutes >= 10) {
                hours = 0;
                System.out.printf("%d:%d", hours, minutes);
            } else {
                hours = 0;
                System.out.printf("%d:0%d", hours, minutes);
            }
        }
    }
}
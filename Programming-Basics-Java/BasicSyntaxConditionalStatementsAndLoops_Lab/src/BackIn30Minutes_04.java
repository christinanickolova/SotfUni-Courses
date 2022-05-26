import java.util.Scanner;

public class BackIn30Minutes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initHour = Integer.parseInt(scanner.nextLine());
        int initMin = Integer.parseInt(scanner.nextLine());

        int timeInMinutes = (initHour * 60) + initMin + 30;

        int hour = timeInMinutes / 60;
        int minute = timeInMinutes % 60;

        if (hour > 23) {
            hour = 0;
        }

        System.out.printf("%d:%02d", hour, minute);
    }
}

import java.util.Scanner;

public class SleepyTomCat_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int restDays = Integer.parseInt(scanner.nextLine());
        int workDays = 365 - restDays;
        int totalPlayTime = (restDays) * 127 + (workDays * 63);
        double hours = 0;
        double minutes = 0;
        if (totalPlayTime <= 30000) {
            hours = 30000 - totalPlayTime;
            hours /= 60;
            minutes = (30000 - totalPlayTime) % 60;
            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %.0f minutes less for play", Math.floor(hours), minutes);
        } else {
            hours = totalPlayTime - 30000;
            hours /= 60;
            minutes = (totalPlayTime - 30000) % 60;
            System.out.println("Tom will run away");
            System.out.printf("%.0f hours and %.0f minutes more for play", Math.floor(hours), minutes);
        }
    }
}
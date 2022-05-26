import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double timeInSecondsPerMeter = Double.parseDouble(scanner.nextLine());
        double target = meters * timeInSecondsPerMeter;
        double slowingSeconds = Math.floor(meters / 15) * 12.5;
        double totalTime = target + slowingSeconds;
        if (totalTime >= recordInSeconds) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - recordInSeconds);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }
    }
}
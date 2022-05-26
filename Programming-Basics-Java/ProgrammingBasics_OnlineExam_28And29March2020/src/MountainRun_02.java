import java.util.Scanner;

public class MountainRun_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeInSecondsPerMeter = Double.parseDouble(scanner.nextLine());
        double totalTime = distanceInMeters * timeInSecondsPerMeter;
        double slowing = Math.floor(distanceInMeters / 50) * 30;
        totalTime += slowing;
        if (totalTime < recordInSeconds) {
            System.out.printf("Yes! The new record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", totalTime - recordInSeconds);
        }
    }
}
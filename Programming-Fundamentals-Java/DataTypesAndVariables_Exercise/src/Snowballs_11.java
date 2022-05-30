import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int bestSnowballSnow = 0;
        int bestSnowballTime = 0;
        int bestSnowballQuality = 0;
        double snowballValue = Double.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            double currentSnowballValue = Math.pow(snowballSnow * 1.0/ snowballTime, snowballQuality);
            if (currentSnowballValue > snowballValue) {
                bestSnowballQuality = snowballQuality;
                bestSnowballTime = snowballTime;
                bestSnowballSnow = snowballSnow;
                snowballValue = currentSnowballValue;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", bestSnowballSnow, bestSnowballTime, snowballValue, bestSnowballQuality);
    }
}

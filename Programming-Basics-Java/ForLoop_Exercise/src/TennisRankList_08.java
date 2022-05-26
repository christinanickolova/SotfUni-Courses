import java.util.Scanner;

public class TennisRankList_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournaments = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());
        int totalPoints = 0;
        double count = 0;
        double average = 0;
        for (int i = 1; i <= tournaments; i++) {
            String stage = scanner.nextLine();
            switch (stage) {
                case "W":
                    totalPoints = 2000;
                    startPoints += totalPoints;
                    average += totalPoints;
                    count++;
                    break;
                case "F":
                    totalPoints = 1200;
                    startPoints += totalPoints;
                    average += totalPoints;
                    break;
                case "SF":
                    totalPoints = 720;
                    startPoints += totalPoints;
                    average += totalPoints;
                    break;
                default:
                    break;
            }
        }
        System.out.printf("Final points: %d%n", startPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(average / tournaments));
        System.out.printf("%.2f%%", count / tournaments * 100);
    }
}
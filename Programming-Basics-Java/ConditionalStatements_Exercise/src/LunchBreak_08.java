import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        int movieLength = Integer.parseInt(scanner.nextLine());
        int breakLength = Integer.parseInt(scanner.nextLine());
        double lunchTime = breakLength / 8.0;
        double restTime = breakLength / 4.0;
        double timeLeft = breakLength - lunchTime - restTime;
        if (timeLeft >= movieLength) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", movie,
                    Math.ceil(timeLeft - movieLength));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", movie,
                    Math.ceil(movieLength - timeLeft));
        }
    }
}
import java.util.Scanner;

public class BestPlayer_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int totalGoals = Integer.MIN_VALUE;
        String bestPlayer = "";
        while (!input.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());
                if (goals > totalGoals) {
                    totalGoals = goals;
                    bestPlayer = input;
                }
                if (goals >= 10) {
                    break;
                }
            input = scanner.nextLine();
        }
        System.out.println(bestPlayer + " is the best player!");
        if (totalGoals >= 3) {
            System.out.println("He has scored " + totalGoals + " goals and made a hat-trick !!!");
        } else {
            System.out.println("He has scored " + totalGoals + " goals.");
        }
    }
}
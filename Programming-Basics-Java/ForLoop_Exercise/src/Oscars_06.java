import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actor = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int evaluatesCount = Integer.parseInt(scanner.nextLine());
        double evaluatePoints = 0;
        for (int i = 1; i <= evaluatesCount; i++) {
            String name = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());
            evaluatePoints = name.length() * points / 2;
            academyPoints += evaluatePoints;
            if (academyPoints >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, academyPoints);
                break;
            }
        }
        if (academyPoints < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actor, 1250.5 - academyPoints);
        }
    }
}
import java.net.Inet4Address;
import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int totalSteps = 0;
        int steps = 0;
        while (true) {
            if (!input.equals("Going home")) {
                steps = Integer.parseInt(input);
                totalSteps += steps;
                if (totalSteps >= 10000) {
                    System.out.println("Goal reached! Good job!");
                    System.out.printf("%d steps over the goal!", totalSteps - 10000);
                    break;
                }
            } else {
                input = scanner.nextLine();
                steps = Integer.parseInt(input);
                totalSteps += steps;
                if (totalSteps >= 10000) {
                    System.out.println("Goal reached! Good job!");
                    System.out.printf("%d steps over the goal!", totalSteps - 10000);
                    break;
                } else  {
                    System.out.printf("%d more steps to reach goal.", 10000 - totalSteps);
                    break;
                }
            }
            input = scanner.nextLine();
        }
    }
}
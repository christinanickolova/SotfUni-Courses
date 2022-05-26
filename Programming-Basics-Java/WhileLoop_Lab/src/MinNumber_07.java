import java.util.Scanner;

public class MinNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            int num = Integer.parseInt(input);
            if (num < min) {
                min = num;
            }
            input = scanner.nextLine();
        }
        System.out.println(min);
    }
}
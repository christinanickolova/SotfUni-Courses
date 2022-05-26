import java.util.Scanner;

public class MaxNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            int num = Integer.parseInt(input);
            if (num > max) {
                max = num;
            }
            input = scanner.nextLine();
        }
        System.out.println(max);
    }
}
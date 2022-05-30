import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            char current = scanner.nextLine().charAt(0);
            sum += current;
        }

        System.out.println("The sum equals: " + sum);

    }
}

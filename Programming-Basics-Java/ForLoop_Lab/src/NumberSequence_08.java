import java.util.Scanner;

public class NumberSequence_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int first = Integer.parseInt(scanner.nextLine());
        int min = first;
        int max = first;
        for (int i = 1; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num < min) {
                min = num;
            } else if (num > min && num > max) {
                max = num;
            }
        }
        System.out.printf("Max number: %d%n", max);
        System.out.printf("Min number: %d", min);
    }
}
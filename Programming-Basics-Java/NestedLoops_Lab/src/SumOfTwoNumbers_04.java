import java.util.Scanner;

public class SumOfTwoNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                count++;
                if (i + j == magicNumber) {
                    System.out.println("Combination N:" + count + " (" + i + " + " + j + " = " + magicNumber + ")");
                    return;
                }
            }
        }
        System.out.println(count + " combinations - neither equals " + magicNumber);
    }
}
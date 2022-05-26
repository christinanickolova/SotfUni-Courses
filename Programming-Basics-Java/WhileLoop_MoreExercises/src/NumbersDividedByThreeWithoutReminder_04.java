import java.util.Scanner;

public class NumbersDividedByThreeWithoutReminder_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        while (number <= 100) {
            if (number % 3 == 0) {
                System.out.println(number);
            }
            number++;
        }
    }
}
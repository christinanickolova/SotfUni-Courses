import java.util.Scanner;

public class Division_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int biggerNumber = 0;
        int counter = 0;

        if (number % 2 == 0) {
            biggerNumber = 2;
            if (number % 3 == 0) {
                biggerNumber = 6;
                counter++;
            }
        } if (number % 3 == 0) {
            if (counter == 0) {
            biggerNumber = 3;
            }
        } if (number % 7 == 0) {
            biggerNumber = 7;
        } if (number % 10 == 0) {
            biggerNumber = 10;
        }
        if (biggerNumber > 0) {
            System.out.println("The number is divisible by " + biggerNumber);
        } else {
            System.out.println("Not divisible");
        }
    }
}

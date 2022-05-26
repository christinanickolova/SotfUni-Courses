import java.util.Scanner;

public class BonusScore_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        double bonus = 0;
        if (num <= 100) {
            bonus = 5;
        }
        else if (num <= 1000) {
            bonus = num * 0.2;
        }
        else {
            bonus = num * 0.1;
        }
        if (num % 2 == 0) {
            bonus += 1;
            System.out.println(bonus);
            System.out.println(bonus + num);
        }
        else if (num % 5 == 0) {
            bonus += 2;
            System.out.println(bonus);
            System.out.println(bonus + num);
        }
        else {
            System.out.println(bonus);
            System.out.println(bonus + num);
        }
    }
}
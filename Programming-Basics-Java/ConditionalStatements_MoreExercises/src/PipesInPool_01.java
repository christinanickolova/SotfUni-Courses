import java.util.Scanner;

public class PipesInPool_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double p1Debit = p1 * h;
        double p2Debit = p2 * h;
        double p1DebitInPercentage = p1Debit * 100 / (p1Debit + p2Debit);
        double p2DebitInPercentage = p2Debit * 100 / (p1Debit + p2Debit);
        double poolsDebitInPercentage = (p1Debit + p2Debit) * 100 / v;
        if (p1Debit + p2Debit <= v) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", poolsDebitInPercentage,
                    p1DebitInPercentage, p2DebitInPercentage);
        } else {
            System.out.printf("For %.2f hours thw pool overflows with %.2f liters.", h, p1Debit + p2Debit - v);
        }
    }
}
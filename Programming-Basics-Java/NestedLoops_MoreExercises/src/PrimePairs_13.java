import java.util.Scanner;

public class PrimePairs_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startAmountFirstPair = Integer.parseInt(scanner.nextLine());
        int startAmountSecondPair = Integer.parseInt(scanner.nextLine());
        int diffFirstPair = Integer.parseInt(scanner.nextLine());
        int diffSecondPair = Integer.parseInt(scanner.nextLine());
        boolean isPrime = true;
        int firstPair = 0;
        int secondPair = 0;
        for (int i = startAmountFirstPair; i <= startAmountFirstPair + diffFirstPair; i++) {
            for (int prime = 2; prime <= Math.sqrt(i); prime++) {
                if (i % prime == 0) {
                    isPrime = false;
                    break;
                } else {
                    firstPair = i;
                    isPrime = true;
                }
            }
            if (!isPrime) {
                continue;
            }
            for (int j = startAmountSecondPair; j <= startAmountSecondPair + diffSecondPair; j++) {
                for (int prime = 2; prime <= Math.sqrt(j); prime++) {
                    if (j % prime == 0) {
                        isPrime = false;
                        break;
                    } else {
                        secondPair = j;
                        isPrime = true;
                    }
                }
                if (!isPrime) {
                    continue;
                }
                System.out.printf("%d%d%n", firstPair, secondPair);
            }
        }
    }
}
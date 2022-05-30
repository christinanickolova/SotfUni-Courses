import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Long.parseLong(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        byte y = Byte.parseByte(scanner.nextLine());
        int count = 0;
        long nOriginalAmount = n;
        while (n >= m) {
            n -= m;
            count++;
            if (n == nOriginalAmount / 2 && y > 0) {
                n /= y;
            }
        }
        System.out.println(n);
        System.out.println(count);
    }
}

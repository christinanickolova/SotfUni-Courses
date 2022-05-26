import java.util.Scanner;

public class EvenPowersOf2_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= num; i += 2) {
            System.out.println(Math.pow(2, i));
        }
    }
}
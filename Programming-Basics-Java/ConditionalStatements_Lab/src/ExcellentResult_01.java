import java.util.Scanner;

public class ExcellentResult_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if (num >= 5) {
            System.out.println("Excellent!");
        }
    }
}
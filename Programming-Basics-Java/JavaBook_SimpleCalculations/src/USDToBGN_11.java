import java.util.Scanner;

public class USDToBGN_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dollars = Double.parseDouble(scanner.nextLine());
        double levs = dollars * 1.79549;
        System.out.printf("%.2f", levs);
    }
}
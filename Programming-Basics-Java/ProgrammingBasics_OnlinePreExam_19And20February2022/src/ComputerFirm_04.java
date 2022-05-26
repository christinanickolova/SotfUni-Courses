import java.util.Scanner;

public class ComputerFirm_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int computers = Integer.parseInt(scanner.nextLine());
        int rate = 0;
        int sales = 0;
        double trueSales = 0;
        double finalSales = 0;
        double average = 0;
        for (int i = 0; i < computers; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            rate = number % 10;
            sales = number / 10;
            switch (rate) {
                case 2:
                    trueSales = 0;
                    break;
                case 3:
                    trueSales = sales * 1.0 / 2;
                    break;
                case 4:
                    trueSales = sales * 0.7;
                    break;
                case 5:
                    trueSales = sales * 0.85;
                    break;
                case 6:
                    trueSales = sales;
                    break;
                default:
                    break;
            }
            finalSales += trueSales;
            average += rate;
        }
        System.out.printf("%.2f%n", finalSales);
        System.out.printf("%.2f", average / computers);
    }
}
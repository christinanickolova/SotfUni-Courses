import java.util.Scanner;

public class Histogram_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        for (int i = 1; i <= n ; i++) {
            double num = Double.parseDouble(scanner.nextLine());
            if (num < 200) {
                sum1++;
            } else if (num <= 399) {
                sum2++;
            } else if (num <= 599) {
                sum3++;
            } else if (num <= 799) {
                sum4++;
            } else {
                sum5++;
            }
        }
        p1 = sum1 / n * 100;
        p2 = sum2 / n * 100;
        p3 = sum3 / n * 100;
        p4 = sum4 / n * 100;
        p5 = sum5 / n * 100;
        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);
        System.out.printf("%.2f%%%n", p5);
    }
}
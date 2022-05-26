import java.util.Scanner;

public class GameOfIntervals_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double points = 0;
        double count = 0;
        double n1 = 0;
        double n2 = 0;
        double n3 = 0;
        double n4 = 0;
        double n5 = 0;
        double n6 = 0;
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        double p6 = 0;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num >= 0 && num < 10) {
                count = num * 0.2;
                points += count;
                n1++;
            } else if (num >= 10 && num < 20) {
                count = num * 0.3;
                points += count;
                n2++;
            } else if (num >= 20 && num < 30) {
                count = num * 0.4;
                points += count;
                n3++;
            } else if (num >= 30 && num < 40) {
                points += 50;
                n4++;
            } else if (num >= 40 && num <= 50) {
                points += 100;
                n5++;
            } else {
                points /= 2;
                n6++;
            }
        }
        p1 = n1 / n * 100;
        p2 = n2 / n * 100;
        p3 = n3 / n * 100;
        p4 = n4 / n * 100;
        p5 = n5 / n * 100;
        p6 = n6 / n * 100;
        System.out.printf("%.2f%n", points);
        System.out.printf("From 0 to 9: %.2f%%%n", p1);
        System.out.printf("From 10 to 19: %.2f%%%n", p2);
        System.out.printf("From 20 to 29: %.2f%%%n", p3);
        System.out.printf("From 30 to 39: %.2f%%%n", p4);
        System.out.printf("From 40 to : %.2f%%%n", p5);
        System.out.printf("Invalid numbers: %.2f%%%n", p6);
    }
}
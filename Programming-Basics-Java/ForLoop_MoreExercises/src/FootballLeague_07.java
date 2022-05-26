import java.util.Scanner;

public class FootballLeague_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int fensCount = Integer.parseInt(scanner.nextLine());
        int a = 0;
        int b = 0;
        int v = 0;
        int g = 0;
        for (int i = 0; i < fensCount; i++) {
            String sector = scanner.nextLine();
            switch (sector) {
                case "A":
                    a++;
                    break;
                case "B":
                    b++;
                    break;
                case "V":
                    v++;
                    break;
                case "G":
                    g++;
                    break;
                default:
                    break;
            }
        }
        double p1 = a * 1.0 / fensCount * 100;
        double p2 = b * 1.0 / fensCount * 100;
        double p3 = v * 1.0 / fensCount * 100;
        double p4 = g * 1.0 / fensCount * 100;
        double p5 = fensCount * 1.0 / stadiumCapacity * 100;
        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);
        System.out.printf("%.2f%%%n", p5);
    }
}
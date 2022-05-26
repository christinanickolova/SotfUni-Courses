import java.util.Scanner;

public class ChangeTiles_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());
        double l = Double.parseDouble(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int o = Integer.parseInt(scanner.nextLine());
        int area = n * n;
        int benchArea = m * o;
        double tileArea = w * l;
        int areaForCoverage = area - benchArea;
        System.out.println(areaForCoverage / tileArea);
        System.out.println(areaForCoverage / tileArea * 0.2);
    }
}
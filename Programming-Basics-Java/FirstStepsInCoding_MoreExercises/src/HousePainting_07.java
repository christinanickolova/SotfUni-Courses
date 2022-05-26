import java.util.Scanner;
import java.util.function.DoubleFunction;

public class HousePainting_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        //side walls
        double sideWallArea = x * y;
        double windowArea = 1.5 * 1.5;
        double backWallArea = x * x;
        double doorArea = 1.2 * 2;
        double totalArea = (2 * (sideWallArea - windowArea)) + (2 * backWallArea) - doorArea;
        //System.out.printf("%.2f", totalArea);
        double greenPaint = totalArea / 3.4;
        // roof
        double rectanglesAreas = 2 * x * y;
        double trianglesAreas = 2 * (x * h / 2);
        double totalAreaRoof = rectanglesAreas + trianglesAreas;
        //System.out.printf("%.2f", totalAreaRoof);
        double redPaint = totalAreaRoof / 4.3;
        System.out.printf("%.2f", greenPaint);
        System.out.println();
        System.out.printf("%.2f", redPaint);;
        System.out.println();
    }
}
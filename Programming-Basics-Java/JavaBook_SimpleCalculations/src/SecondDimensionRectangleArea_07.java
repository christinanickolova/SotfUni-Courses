import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SecondDimensionRectangleArea_07 {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.####");
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double area = Math.abs(x1 - x2) * Math.abs(y1 - y2);
        double perimeter = 2 * (Math.abs(x1 - x2) + Math.abs(y1 - y2));
        //BigDecimal decimal1 = new BigDecimal(area);
        //BigDecimal decimal2 = new BigDecimal(perimeter);
        System.out.println(decimalFormat.format(area));
        System.out.println(decimalFormat.format(perimeter));
    }
}
import java.util.Scanner;

public class CircleAreaAndPerimeter_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());
        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
import java.util.Scanner;

public class SortNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        double isBigger = number;
        double isMiddle = number;
        double isSmaller = number;
        for (int i = 1; i < 3; i++) {
           double nextNumber = Double.parseDouble(scanner.nextLine());
           if (nextNumber > isBigger) {
               isMiddle = isBigger;
               isBigger = nextNumber;
           } else {
               isMiddle = nextNumber;
               isSmaller = isMiddle;
           }
           if (nextNumber < isSmaller) {
               isSmaller = nextNumber;
           }
        }
        System.out.printf("%.0f%n%.0f%n%.0f%n", isBigger, isMiddle, isSmaller);
    }
}

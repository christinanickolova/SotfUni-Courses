import java.util.Scanner;

public class TrainingLab_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double l = Double.parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());
        double lInCm = l * 100;
        double wInCm = w * 100;
        double columns = Math.floor(lInCm / 120);
        double rows = Math.floor((wInCm - 100) / 70);
        double workPlaces = (columns * rows) - 3;
        System.out.printf("%.0f", workPlaces);
    }
}
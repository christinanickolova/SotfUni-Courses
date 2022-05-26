import java.util.Scanner;

public class TrainingLab_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double h = Double.parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());
        double workPlacesInRow = Math.floor(((w * 100) - 100) / 70);
        //System.out.println(workPlacesInRow);
        double workPlacesInColumn = Math.floor((h * 100) / 120);
        double totalWorkPlaces = (workPlacesInColumn * workPlacesInRow) - 3;
        System.out.printf("%.0f", totalWorkPlaces);
    }
}
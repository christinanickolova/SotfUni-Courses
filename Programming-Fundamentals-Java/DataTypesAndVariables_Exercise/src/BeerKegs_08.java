import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String biggest = "";
        double volume = Double.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double currentVolume = Math.PI * Math.pow(radius, 2) * height;
            if (currentVolume > volume) {
                volume = currentVolume;
                biggest = model;
            }
        }
        System.out.println(biggest);
    }
}
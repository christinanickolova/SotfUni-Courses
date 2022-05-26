import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = Integer.parseInt(scanner.nextLine());
        int w = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());
        int v = l * w * h;
        double vInLiters = v * 0.001;
        double total = vInLiters * (1 - (percentage / 100));
        System.out.println(total);
    }
}
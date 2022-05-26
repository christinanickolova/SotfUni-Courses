import javax.print.attribute.standard.JobOriginatingUserName;
import java.util.Scanner;
import java.util.zip.DeflaterInputStream;

public class BikeRace_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String traceType = scanner.nextLine();
        double juniorsTax = 0;
        double seniorsTax = 0;
        double discount = 0;
        switch (traceType) {
            case "trail":
                juniorsTax = juniors * 5.5;
                seniorsTax = seniors * 7;
                break;
            case "cross-country":
                juniorsTax = juniors * 8;
                seniorsTax = seniors * 9.5;
                break;
            case "downhill":
                juniorsTax = juniors * 12.25;
                seniorsTax = seniors * 13.75;
                break;
            case "road":
                juniorsTax = juniors * 20;
                seniorsTax = seniors * 21.5;
                break;
            default:
                break;
        }
        if (traceType.equals("cross-country") && (juniors + seniors >= 50)) {
            discount = 8 * 0.25;
            juniorsTax -= discount * juniors;
            discount = 9.5 * 0.25;
            seniorsTax -= discount * seniors;
        }
        double total = juniorsTax + seniorsTax;
        discount = total * 0.05;
        total -= discount;
        System.out.printf("%.2f", total);
    }
}
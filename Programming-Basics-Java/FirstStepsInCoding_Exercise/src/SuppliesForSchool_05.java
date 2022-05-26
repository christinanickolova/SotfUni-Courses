import java.util.Scanner;

public class SuppliesForSchool_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int penPacks = Integer.parseInt(scanner.nextLine());
        int markerPacks = Integer.parseInt(scanner.nextLine());
        int detergentLiters = Integer.parseInt(scanner.nextLine());
        int rateDiscount = Integer.parseInt(scanner.nextLine());
        double packOfPensPrice = 5.8;
        double packOfMarkersPrice = 7.2;
        double detergentPerLiterPrice = 1.2;
        double penPacksPrice = penPacks * packOfPensPrice;
        double markerPacksPrice = markerPacks * packOfMarkersPrice;
        double detergentPrice = detergentLiters * detergentPerLiterPrice;
        double totalPrice = penPacksPrice + markerPacksPrice + detergentPrice;
        double priceWithDiscount = totalPrice - (totalPrice * rateDiscount / 100);
        System.out.println(priceWithDiscount);
    }
}
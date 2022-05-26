import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int annualFee = Integer.parseInt(scanner.nextLine());
        double sneakersPrice = annualFee - (annualFee * 0.4);
        double outfitPrice = sneakersPrice - (sneakersPrice * 0.2);
        double ballPrice = outfitPrice * 0.25;
        double accessoriesPrice = ballPrice * 0.2;
        double totalPrice = annualFee + sneakersPrice + outfitPrice + ballPrice + accessoriesPrice;
        System.out.println(totalPrice);
    }
}
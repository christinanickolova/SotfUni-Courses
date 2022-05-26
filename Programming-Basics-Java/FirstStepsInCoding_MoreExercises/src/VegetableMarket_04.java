import java.util.Scanner;

public class VegetableMarket_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vegetablesPrice = Double.parseDouble(scanner.nextLine());
        double fruitsPrice = Double.parseDouble(scanner.nextLine());
        int vegetablesWeight = Integer.parseInt(scanner.nextLine());
        int fruitsWeight = Integer.parseInt(scanner.nextLine());
        double vegetablesCost = vegetablesPrice * vegetablesWeight;
        double fruitsCost = fruitsPrice * fruitsWeight;
        double totalCost = vegetablesCost + fruitsCost;
        double convert = totalCost / 1.94;
        System.out.printf("%.2f", convert);
    }
}
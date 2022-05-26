import java.util.Scanner;

public class TransportPrice_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String travelTime = scanner.nextLine();
        double lowestPrice = 0;
        //•	Такси. Начална такса: 0.70 лв. Дневна тарифа: 0.79 лв. / км. Нощна тарифа: 0.90 лв. / км.
        //•	Автобус. Дневна / нощна тарифа: 0.09 лв. / км. Може да се използва за разстояния минимум 20 км.
        //•	Влак. Дневна / нощна тарифа: 0.06 лв. / км. Може да се използва за разстояния минимум 100 км.
        if (n < 20) {
            if (travelTime.equals("day")) {
                lowestPrice = 0.7 + (0.79 * n);
            } else if (travelTime.equals("night")) {
                lowestPrice = 0.7 + (0.9 * n);
            }
        } else if (n < 100) {
            lowestPrice = 0.09 * n;
        } else {
            lowestPrice = 0.06 * n;
        }
        System.out.printf("%.2f", lowestPrice);
    }
}
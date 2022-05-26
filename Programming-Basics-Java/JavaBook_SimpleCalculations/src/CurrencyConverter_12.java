import java.util.Scanner;

public class CurrencyConverter_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyToConvert = Double.parseDouble(scanner.nextLine());
        String currency1 = scanner.nextLine();
        String currency2 = scanner.nextLine();
        double total = 0;
        if (currency1.equals("BGN")) {
            if (currency2.equals("USD")) {
                total = moneyToConvert / 1.79549;
            } else if (currency2.equals("EUR")) {
                total = moneyToConvert / 1.95583;
            } else if (currency2.equals("GBP")) {
                total = moneyToConvert / 2.53405;
            }
        } else if (currency1.equals("USD")) {
            if (currency2.equals("BGN")) {
                total = moneyToConvert * 1.79549;
                //System.out.printf("%.2f", total);
            } else if (currency2.equals("EUR")) {
                total = moneyToConvert * 1.79549;
                total /= 1.95583;
                //System.out.printf("%.2f", total);
            } else if (currency2.equals("GBP")) {
                total = moneyToConvert * 1.79549;
                total /= 2.53405;
            }
        } else if (currency1.equals("EUR")) {
            if (currency2.equals("USD")) {
                total = moneyToConvert * 1.95583;
                total /= 1.79549;
            } else if (currency2.equals("BGN")) {
                total = moneyToConvert * 1.95583;
            } else if (currency2.equals("GBP")) {
                total = moneyToConvert * 1.95583;
                total /= 2.53405;
                //System.out.printf("%.2f", total);
            }
        } else if (currency1.equals("GBP")) {
            if (currency2.equals("USD")) {
                total = moneyToConvert * 2.53405;
                total /= 1.79549;
            } else if (currency2.equals("EUR")) {
                total = moneyToConvert * 2.53405;
                total /= 1.95583;
            } else if (currency2.equals("BGN")) {
                total = moneyToConvert * 2.53405;
            }
        }
        System.out.printf("%.2f %s", total, currency2);
    }
}
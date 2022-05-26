import java.util.Objects;
import java.util.Scanner;

public class WeatherForecast_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String weather = scanner.nextLine();
        if (Objects.equals(weather, "sunny")){
            System.out.println("It's warm outside!");
        }
        else {
            System.out.println("It's cold outside!");
        }
    }
}
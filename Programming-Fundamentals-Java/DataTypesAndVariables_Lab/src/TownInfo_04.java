import java.util.Scanner;

public class TownInfo_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //"Town {town name} has population of {population} and area {area} square km.".

        String town = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        int area = Integer.parseInt(scanner.nextLine());

        String result = String.format("Town %s has population of %d and area %d square km.", town, population, area);

        System.out.println(result);
    }
}

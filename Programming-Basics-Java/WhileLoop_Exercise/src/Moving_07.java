import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int v = width * length * height;
        int boxesCount = 0;
        String input = scanner.nextLine();
        while (!input.equals("Done")) {
          int boxes = Integer.parseInt(input);
          boxesCount += boxes;
          if (boxesCount > v) {
              System.out.printf("No more free space! You need %d Cubic meters more.", boxesCount - v);
              break;
          }
          input = scanner.nextLine();
        }
        if (boxesCount < v) {
            System.out.printf("%d Cubic meters left.", v - boxesCount);
        }
    }
}
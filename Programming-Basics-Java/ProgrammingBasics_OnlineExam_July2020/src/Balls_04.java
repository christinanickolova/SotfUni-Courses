import java.util.Scanner;

public class Balls_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int points = 0;
        int orangeBallsCount = 0;
        int redBallsCount = 0;
        int yellowBallsCount = 0;
        int whiteBallsCount = 0;
        int blackBallsCount = 0;
        int otherColorBalls = 0;
        for (int i = 0; i < n; i++) {
            String colors = scanner.nextLine();
            switch (colors) {
                case "red":
                    points += 5;
                    redBallsCount++;
                    break;
                case "orange":
                    points += 10;
                    orangeBallsCount++;
                    break;
                case "yellow":
                    points += 15;
                    yellowBallsCount++;
                    break;
                case "white":
                    points += 20;
                    whiteBallsCount++;
                    break;
                default:
                    if (!colors.equals("black")) {
                        otherColorBalls++;
                    }
                    break;
            }
            if (colors.equals("black")) {
                points /= 2;
                blackBallsCount++;
            }
        }
        System.out.println("Total points: " + points);
        System.out.println("Red balls: " + redBallsCount);
        System.out.println("Orange balls: " + orangeBallsCount);
        System.out.println("Yellow balls: " + yellowBallsCount);
        System.out.println("White balls: " + whiteBallsCount);
        System.out.println("Other colors picked: " + otherColorBalls);
        System.out.println("Divides from black balls: " + blackBallsCount);
    }
}
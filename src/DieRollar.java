import java.util.Random;
import java.util.Scanner;
public class DieRollar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;
        while (playAgain) {
            int rollCount = 0;
            System.out.println("Roll\tDie1\tDie2\tDie3\tSum");
            System.out.println("----------------------------------------------------------");

            while (true) {
                rollCount++;
                int die1 = random.nextInt(6) + 1;
                int die2 = random.nextInt(6) + 1;
                int die3 = random.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                System.out.printf("%4d\t%4d\t%4d\t%4d\t%4d\n", rollCount, die1, die2, die3, sum);

                if (die1 == die2 && die2 == die3) {
                    break;
                }
            }

            System.out.print("Do you want to roll again? (yes/no): ");
            String response = scanner.next().toLowerCase();
            playAgain = response.equals("yes");
        }

        scanner.close();
        System.out.println("Thanks for playing!");
    }
}

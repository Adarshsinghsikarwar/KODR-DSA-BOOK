import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int requiredValue = (int)(Math.random() * 10) + 1; // 1 to 10
        int giveValue;

        do {
            System.out.print("Enter your guess (1-10): ");
            giveValue = sc.nextInt();

            if (giveValue != requiredValue) {
                System.out.println("Wrong, try again");
            }

        } while (giveValue != requiredValue);

        System.out.println("You won!");
    }
}
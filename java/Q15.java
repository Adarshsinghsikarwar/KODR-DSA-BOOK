import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a % 2 == 0){
            System.out.println("It is an even number");
        }
        else {
            System.out.println("It is an odd number");
        }
    }
}

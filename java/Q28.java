import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter val : ");
        int val = sc.nextInt();
        int factorial = 1;

        for(int i = 1; i <= val; i++){
            factorial *= i;
        }
        System.out.println("The factorial : "+factorial);
    }
}

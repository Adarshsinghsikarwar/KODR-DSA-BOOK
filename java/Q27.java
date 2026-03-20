import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value : ");
        int val = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= val; i++){
            sum += i;
        }
        System.out.println("The sum : "+sum);
    }
}

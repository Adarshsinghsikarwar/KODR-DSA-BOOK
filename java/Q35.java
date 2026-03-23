import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int sum = 0;

        while(num > 0){
            int val = num % 10;
            sum += val;
            num /= 10;
        }

        System.out.println("The sum : " + sum);
    }
}

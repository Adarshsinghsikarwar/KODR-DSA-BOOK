import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int rev = 0;

        while(num > 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        if(num == rev){
            System.out.println("This is palindromic");
        }
        else {
            System.out.println("This is not palindromic");
        }
    }
}

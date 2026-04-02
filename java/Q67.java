import java.util.Scanner;

public class Q67 {

    public  static int isStrong(int n){
        int sum = 0;
        while(n > 0){
            int last = n % 10;
            n /= 10;
            int fact = 1;
            for(int i = 1; i <= last; i++){
                fact *= i;
            }
            sum += fact;
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int ans = isStrong(n);

        if(ans == n){
            System.out.println("It is a strong number");
            return;
        }
        System.out.print("it is not a strong number");

    }
}

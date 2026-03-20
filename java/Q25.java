import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int val = sc.nextInt();
        for( ;val > 0; val--){
            System.out.println("val : "+val);
        }
    }
}

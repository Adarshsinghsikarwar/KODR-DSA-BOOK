import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a val : ");
        int val = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(val * i);
        }
    }
}

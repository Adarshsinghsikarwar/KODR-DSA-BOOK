import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a value : ");
        int val = sc.nextInt();

        for(int i = 1; i <= val; i++){
            System.out.println("val : "+i);
        }
    }
}

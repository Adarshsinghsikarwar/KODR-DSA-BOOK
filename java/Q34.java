import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter val : ");
        int val = sc.nextInt();
        while (val > 0){
            int single = val % 10;
            System.out.println("The val : "+ single);
            val /= 10;
        }
    }
}

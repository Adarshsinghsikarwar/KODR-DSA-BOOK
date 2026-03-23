import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value : ");
        int val = sc.nextInt();

        int count = 0;

        for(int i = 1; i <= val / i; i++){
            if(val % i == 0){
                count++; // i

                if(i != val / i){
                    count++; // paired divisor
                }
            }
        }

        if(count == 2){
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}
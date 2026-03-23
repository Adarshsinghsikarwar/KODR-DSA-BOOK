import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value : ");
        int val = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= val / i; i++){
            if(val % i == 0){
                sum += i;

                if(i != val / i){
                    sum += val / i;
                }
            }
        }
        System.out.println("The sum is : " + sum);
    }
}
import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter val : ");
        int val = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;
        int i =1;

        while(i <= val){
            oddSum +=i;
            i++;
            if(i > val) break;
            evenSum += i;
            i++;
        }
        System.out.println("The sum of even number up to value : "+evenSum);
        System.out.println("The sum of odd number up to value : "+oddSum);
    }
}

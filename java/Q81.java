import java.util.Scanner;

public class Q81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = sc.nextInt();

        int operation = 0;

        while(num1 > 0 && num2 > 0){
            if (num1 > num2) num1 = num1 -num2;
            else num2 = num2 - num1;
            operation++;
        }

        System.out.println("Operation : " + operation);

    }
}

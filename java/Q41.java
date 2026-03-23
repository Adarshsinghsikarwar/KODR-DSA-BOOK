import java.util.Scanner;

public class Q41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("required  result : ");
        int required = sc.nextInt();

        int result = 0;
        do{
            System.out.print("Enter first value : ");
            int a = sc.nextInt();
            System.out.print("Enter second value : ");
            int b = sc.nextInt();
            System.out.print("Enter operator : ");
            char ch = sc.next().charAt(0);
            switch (ch){
                case '+':
                    result = a+b;
                    break;
                case '-' :
                    result = a - b;
                    break;
                case '*':
                    result = a*b;
                    break;
                case '/' :
                    result = a/b;
                    break;
            }
            System.out.println("The value result : "+result);
        }while(result != required);

        System.out.println("you won ");
    }
}

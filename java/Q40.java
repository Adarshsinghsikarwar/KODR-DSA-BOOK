import java.util.Scanner;

public class Q40 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter actualValue : ");
        int actualValue = sc.nextInt();
        int assumeValue = 0;
        do{

            System.out.print("Enter assumeValue :  ");
            assumeValue = sc.nextInt();
            System.out.println("Wrong value ");

        }while(actualValue != assumeValue);

        System.out.println("Matched  value ");


    }
}

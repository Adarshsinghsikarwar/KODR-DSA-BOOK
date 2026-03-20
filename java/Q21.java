import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your shopping price : ");
        float shopping = sc.nextFloat();

        if(shopping >= 0 && shopping <= 500){
            System.out.println("you got 5% discount on your shopping : "+ (shopping - (shopping/100 *5)));
        }
        else if (shopping >= 501 && shopping <= 1999){
            System.out.println("you got 10% discount on your shopping : "+(shopping - (shopping/100 * 10)));
        }
        else {
            System.out.println("you got 20% discount on your shopping : "+(shopping - (shopping/100 * 20)));
        }

    }
}

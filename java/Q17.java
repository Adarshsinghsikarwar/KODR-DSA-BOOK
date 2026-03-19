
import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day){
            case 1 :
                System.out.println("It is sunday");
                break;
            case 2 :
                System.out.println("It is monday");
                break;
            case 3 :
                System.out.println("It is tuesday");
                break;
            case 4 :
                System.out.println("It is wednesday");
                break;
            case 5 :
                System.out.println("It is thursday");
                break;
            case 6 :
                System.out.println("It is friday");
                break;
            case 7 :
                System.out.println("It is saturday");
                break;
        }
    }
}

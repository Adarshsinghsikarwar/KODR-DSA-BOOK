import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float p = sc.nextFloat();
        float r = sc.nextFloat();
        float n = sc.nextFloat();

        System.out.println("The compound interest : "+ (p *(1 + r/100)*n-p));
    }
}

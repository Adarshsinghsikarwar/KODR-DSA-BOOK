import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b){
            System.out.println("A is greater than B");
        }
        else {
            System.out.println("B is greater than A");
        }
    }
}

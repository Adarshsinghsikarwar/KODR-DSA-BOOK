import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double area = 4*3.14 * Math.pow(r,2);

        System.out.println("Area of Sphere : " + area );
    }
}

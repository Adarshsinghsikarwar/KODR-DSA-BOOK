import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double s = (a + b + c) / 2.0;  // FIXED
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Area of triangle by Herons : " + area);
    }
}

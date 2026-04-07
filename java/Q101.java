import java.util.Scanner;

public class Q101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.nextLine();
        int n = s.length();

        for(int i = n-1; i > 0; i--){
            System.out.println(s.charAt(i));
        }
    }
}

import java.util.Scanner;

public class Q53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row : ");
        int row = sc.nextInt();
        System.out.print("Enter col : ");
        int col = sc.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j++){
                char ch = (char)(64+j);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

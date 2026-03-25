import java.util.Scanner;

public class Q48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row : ");
        int row = sc.nextInt();
        System.out.print("Enter col : ");
        int col = sc.nextInt();

        for(int i = row; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

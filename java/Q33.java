    import java.util.Scanner;

    public class Q33 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter val : ");
            int val = sc.nextInt();
            System.out.print("Enter pow : ");
            int pow = sc.nextInt();

            int ans = 1;

            for(int i = 1; i <= pow; i++){
                ans = ans * val;
            }
            System.out.println("Ans : " + ans);
        }
    }

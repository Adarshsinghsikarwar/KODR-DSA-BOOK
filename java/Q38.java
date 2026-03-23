import java.util.Scanner;

public class Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int last = num % 10;
        int square = num * num;
        int squareLast = square % 10;

        if(last == squareLast){
            System.out.print("It is automorphic");
        }
        else{
            System.out.print("It is not automorphic");
        }
    }
}

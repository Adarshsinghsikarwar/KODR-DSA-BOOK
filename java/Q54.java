import java.util.Scanner;


// Accept size n from user and create an n size array then take n inputs into it and finally print the sum & average of all elements.
public class Q54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = arr[i];
        }
        System.out.println("Sum of array Element : " + sum);
        System.out.print("Average of array Element : " + sum/2.0);
    }
}

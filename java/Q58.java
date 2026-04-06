
import java.util.*;
//Take n integer inputs from user and store them in an array. Now, copy all the elements into another array in reverse order and print it.

public class Q58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int[] rev = new int[n];
        for(int i = arr.length-1; i >= 0; i--){
            rev[i] = arr[n-i-1];
        }
        System.out.println("actual arr : " + arr.toString());
        System.out.println("reverser arr : " + rev.toString());
    }
}

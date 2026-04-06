
import java.util.Scanner;

// Array left rotation by K elements

public class Q60 {

    public static void rotate(int[] arr , int i , int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        System.out.print("Enter a number of rotation : ");
        int num = sc.nextInt();
        num = num % n;

        rotate(arr , 0 , n-1);
        rotate(arr , 0, num-1);
        rotate(arr, num, n-1);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

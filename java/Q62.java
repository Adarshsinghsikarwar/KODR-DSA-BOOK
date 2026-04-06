
import java.util.Scanner;

// Linear Search an array - If element found print the index, else -1

public class Q62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.print("Enter value : ");
        int num = sc.nextInt();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                System.out.print("element found at index : " + i);
                return;
            }
        }
        System.out.print("Element not found : " + (-1));
    }
}

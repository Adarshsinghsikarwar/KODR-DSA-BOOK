import java.util.*;

//Array left Rotation by 1

public class Q59 {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,5,6,9};

        int n = arr.length;
        int first = arr[0];
        for(int i = 0; i < n-1; i++){
           arr[i] = arr[i+1];
        }
        arr[n-1] = first;

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

}

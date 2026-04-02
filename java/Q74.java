import java.util.*;

public class Q74 {
    public static void main(String[] args) {
        int[] arr = {9, 4, 6, 2, 8, 1};
        int n = arr.length;

        int mid = n / 2;

        Arrays.sort(arr, 0, mid);
        Arrays.sort(arr, mid, n);

        int i = mid, j = n - 1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
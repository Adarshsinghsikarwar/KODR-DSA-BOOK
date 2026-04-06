import java.util.Scanner;

//Move all the negative elements on the left side and positive elements on the right side O(n).

public class Q64 {
    public static void main(String[] args) {
        int[] arr = {1,-2,4,3,-1, -3, 7};

        int i = 0;
        int j = arr.length-1;

        while(i <= j){
            if(arr[i] < 0) i++;
            else if(arr[j] >= 0) j--;
            else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        for(int k : arr){
            System.out.print(k + " ");
        }
    }
}

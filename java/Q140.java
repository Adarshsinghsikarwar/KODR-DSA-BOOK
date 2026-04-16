package java;

import java.util.HashMap;

// Running Sum of 1d Array
public class Q140 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        int n = arr.length;

        if(n == 1){
            System.out.println("Ans : " + arr[0]);
            return;
        }

        for(int i = 1; i < n; i++){
            arr[i] = arr[i] + arr[i-1];
        }
       for(int val : arr){
           System.out.print(val + " ");
       }
    }
}

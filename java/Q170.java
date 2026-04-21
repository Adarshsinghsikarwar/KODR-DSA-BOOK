package java;

import java.util.ArrayList;
import java.util.List;

public class Q170 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        int i = 0;
        int n = arr.length;

        while(i < n) {
            int correctIndex = arr[i] - 1;

            if(arr[i] != arr[correctIndex]) {
                // swap
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for(i = 0; i < n; i++) {
            if(arr[i] != i + 1) {
                ans.add(i + 1);
            }
        }

        System.out.println("Ans : " + ans);
    }
}

package java;

import java.util.HashMap;

public class Q152 {
    public static void main(String[] args) {
        int k = 3;
        int[] arr = {6, 2, 5, 2, 2, 6, 6};
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Step 2: Find unique
        for(int val : map.keySet()){
            if(map.get(val) == 1) {
                System.out.println("Val : " + val);
                return ;
            }
        }

        System.out.println("Val : " + (-1));
    }
}

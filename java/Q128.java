package java;

import java.util.HashMap;

public class Q128 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: count frequency
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int sum = 0;

        // Step 2: sum unique elements
        for(int val : map.keySet()){
            if(map.get(val) == 1){
                sum += val;
            }
        }

        System.out.println("Ans : " + sum);
    }
}

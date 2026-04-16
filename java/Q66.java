
// Print the count of subarrays whose sum is equal to the target. (Ex - {1,2,3,7,5}, T = 12 O/P - 2 - [ {2,3,7}, {7,5} ] - Both subarrays have sum 12)

import java.util.HashMap;

public class Q66 {
    public static void main(String[] args) {
        int[] arr =  {1,1,1};
        int k = 2;
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        map.put(0 , 1);
        for(int i = 0; i < n ; i++){
            sum += arr[i];
            int rem = sum - k;

            if(map.containsKey(rem)){
                count += map.get(rem);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.print("Ans : " + count);

    }
}

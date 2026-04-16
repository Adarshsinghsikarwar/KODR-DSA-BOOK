package java;

import java.util.HashMap;

// Two Sum
public class Q139 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        HashMap<Integer,Integer> mp = new HashMap<>();
        int[] ans = {-1,-1};
        for(int i = 0; i < nums.length; i++){
            int val = target - nums[i];
            if(mp.containsKey(val)){
                ans[0] = mp.get(val);
                ans[1] = i;
            }
            mp.put(nums[i],i);
        }
        System.out.println("Ans : " + ans);
    }
}

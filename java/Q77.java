import java.util.HashMap;

public class Q77 {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1,3,2,2};
        int n = nums.length;

        HashMap<Integer , Integer> map = new HashMap<>();
        int pair = 0;
        int leftOver = 0;


        for (int i = 0; i < n; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        
        for(int key : map.keySet()){
            int val = map.get(key);
            pair += val / 2;
            leftOver += val % 2;
        }

        System.out.println("Pairs: " + pair);
        System.out.println("Leftover: " + leftOver);
    }
}
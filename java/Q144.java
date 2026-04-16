
import java.util.HashMap;

//Majority Element (Boyer Moore's Voting Algo)
public class Q144 {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(mp.containsKey(nums[i])) mp.put(nums[i],mp.get(nums[i])+1);
            else mp.put(nums[i],1);
        }
        for(int key : mp.keySet()){
            if(mp.get(key) > nums.length / 2){
                System.out.println(key);
                return;
            }
        }
        System.out.println("Ans : " + 0);
    }
}

import java.util.HashMap;

// Most Frequent Even Element
public class Q159 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,4,4,1};
        int n = arr.length;
        int maxFreq = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        // count only even elements
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
        }

        if(map.size() == 0) {
            System.out.println("Ans : " + (-1));
            return;
        }

        int ans = -1;

        for(int val : map.keySet()){
            int freq = map.get(val);

            if(freq > maxFreq){
                maxFreq = freq;
                ans = val;
            }
            else if(freq == maxFreq){
                ans = Math.min(ans, val);
            }
        }

        System.out.print("Ans : " + ans);
    }
}

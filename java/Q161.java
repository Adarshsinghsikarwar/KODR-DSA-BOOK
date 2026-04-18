import java.util.HashSet;

// Distribute Candies
public class Q161 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3};
        HashSet<Integer> set = new HashSet<>();
        int n = arr.length;

        for(int i = 0; i < n; i++){
            set.add(arr[i]);
        }
        int ans = Math.min(set.size() , n/2);
        System.out.println("Ans : " + ans);

    }
}


import java.util.HashSet;

public class Q79 {
    public static void main(String[] args) {
        int[] arr = {5,3,6,1,12};
        int n = arr.length;
        int original = 3;

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            set.add(arr[i]);
        }

        while (set.contains(original)){
            original *= 2;
        }
        System.out.print("Ans is : " + original);
    }
}

import java.util.Arrays;

public class Q75 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4};
        int n = arr.length;

        Arrays.sort(arr);
        int sum = 0;

        for(int i = 0; i < n; i+=2){
            sum += Math.abs(arr[i]-arr[i+1]);
        }

        System.out.println(sum);

    }
}

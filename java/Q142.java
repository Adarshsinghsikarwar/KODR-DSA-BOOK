
// Product of Array Except Self
public class Q142 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = arr.length;
        int[] ans = new int[n];

        ans[0] = 1;
        for(int i = 1; i < n; i++){
            ans[i] = ans[i-1] * arr[i-1];
        }
        int right = 1;
        for(int i = n-1; i >= 0; i--){
            ans[i] = ans[i-1] * right;
            right *= arr[i];
        }

        for(int val : ans){
            System.out.print(val + " ");
        }
    }
}

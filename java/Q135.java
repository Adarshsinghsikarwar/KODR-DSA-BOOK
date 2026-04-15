package java;

// Squares of a Sorted Array
public class Q135 {
    public static void main(String[] args) {
        int[] arr = {-10, -5, -2, 3, 6};
        int n = arr.length;
        int[] ans = new int[n];

        int i = 0;
        int j = n-1;
        int k = n-1;

        while(i <= j){
            int left = arr[i] * arr[i];
            int right = arr[j] * arr[j];

            if(left > right){
                ans[k] = left;
                i++;
            }
            else {
                ans[k] = right;
                j--;
            }
            k--;
        }

        for(int val : ans){
            System.out.print(val + " ");
        }
    }
}

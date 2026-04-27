package java;

// Floor of a number in a sorted array
public class Q181 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x = 5;

        int n = arr.length;
        int ans = -1;
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(arr[mid] <= x){
                ans = mid;
                low = mid +1;
            }
            else high = mid -1;
        }

        System.out.print("Ans is : " + ans);
    }
}

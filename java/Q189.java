package java;

public class Q189 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = Integer.MAX_VALUE;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(arr[mid] <= arr[high]){
                ans = Math.min(arr[mid],ans);
                high = mid-1;
            }
            else {
                ans = Math.min(arr[low],ans);
                low = mid+1;
            }
        }

        System.out.println("Ans is : " + ans);
    }
}

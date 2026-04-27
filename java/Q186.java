package java;

// Count of element in the sorted array
public class Q186 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        int target = 2;
        int n = arr.length;
        int low = 0; int high = n-1;
        int  lb = n;
        while (low <= high){
            int mid = low +(high - low) / 2;
            if (arr[mid] >= target){
                lb = mid;
                high = mid-1;
            }
            else low = mid+1;
        }

        low = 0; high = n-1;
        int ub = n;
        while(low <= high){
            int mid = low +(high - low) / 2;
            if(arr[mid] > target){
                ub = mid;
                high = mid -1;
            }
            else low = mid +1;
        }
        System.out.println("Ans is : " + (ub - lb));
    }
}

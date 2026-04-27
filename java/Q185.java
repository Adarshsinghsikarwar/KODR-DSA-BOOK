
// Find First and Last Position of Element in Sorted Array
public class Q185 {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int n = arr.length;
        int lb = -1, ub = -1;
        int[] ans = {-1, -1};

        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                if (arr[mid] == target) lb = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        low = 0;
        high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target) {
                if (arr[mid] == target) ub = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        ans[0] = lb;
        ans[1] = ub;
        System.out.println("Ans is : " + (ans));
    }
}

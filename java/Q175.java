
// Binary Search
public class Q175 {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 9;
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while (low <= high){
            int mid = low +(high-low) / 2;
            if(arr[mid] == target){
                System.out.print("Ans : " + mid);
                return;
            }
            else if (arr[mid] < target) low = mid+1;
            else high = mid-1;
        }
        System.out.print("Ans is : " + (-1));
    }
}

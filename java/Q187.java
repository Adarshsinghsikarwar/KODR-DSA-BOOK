
// // Peak Index in a Mountain Array / Find maximum element in bitonic array (Monotonic, Bitonic Array)
public class Q187 {
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        int n = arr.length;
        int low = 0 , high = n-1;

        while (low < high){
            int mid = low + (high -low) / 2;
            if ((mid > 0 && arr[mid] > arr[mid-1]) && (mid < n && arr[mid] > arr[mid+1])){
                System.out.println("Ans is : " + mid);
                return;
            }
            else if (arr[mid] < arr[mid+1])
                low = mid;
            else if (arr[mid] < arr[mid-1])
                high = mid;
        }
        System.out.println("Ans is : " + (-1));
    }
}

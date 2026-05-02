

public class Q190 {
    public static int bs (int[] arr , int low , int high , int target){
        while (low <= high){
            int mid = low + (high -low ) / 2;
            if ( arr[mid] == target) return mid;
            else if (arr[mid] > target ) high = mid -1;
            else if (arr[mid] < target) low = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
       int[] arr = {4,5,6,7,0,1,2};
       int target = 0;

       int n = arr.length;
       int p = -1;

        int low = 1;
        int high = n-2;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                p = mid;
                break;
            }
            else if(arr[mid] < arr[mid-1] && arr[mid] < arr[mid+1]){
                p = mid;
                break;
            }
            else if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]) {
                if(arr[mid] > arr[n-1]) low = mid+1;
                else high = mid-1;
            }
        }
        if(p==-1){
            int ans = bs(arr,0,n-1,target);
            System.out.println("Ans is : " + ans);
            return;
        }
        int left = bs(arr,0,p,target);
        if(left != -1){
            System.out.println("Ans is : " + left);
            return;
        }
       int right =  bs(arr,p+1,n-1,target);
        System.out.println("Ans is : "+ right);

    }
}

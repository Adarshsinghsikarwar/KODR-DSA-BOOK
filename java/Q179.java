package java;

public class Q179 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 5;

        int n = arr.length;
        int ub = n;
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = low + (high - low);

            if(arr[mid] > target){
                ub = mid;
                high = mid -1;
            }
            else {
                low = mid + 1;
            }
        }

       if(ub > 0 && arr[ub -1] == target) {
           System.out.println("Ans is : " + (ub-1));
           return;
       }

        System.out.println("Ans is : " + ub);

    }
}

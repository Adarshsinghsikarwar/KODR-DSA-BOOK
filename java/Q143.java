

// Maximum Subarray (Kadane's Algo)
public class Q143 {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int n = arr.length;
        int totalSum = arr[0];
        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += arr[i];
            totalSum = Math.max(sum , totalSum);
            if(sum < 0){
                sum = 0;
            }
        }
        System.out.println("Maximum Subarray : " + totalSum);
    }
}

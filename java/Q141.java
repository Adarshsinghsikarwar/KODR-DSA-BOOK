package java;

// Find Pivot Index
public class Q141 {
    public static void main(String[] args) {
       int[] arr = {1,7,3,6,5,6};
        int n = arr.length;
        int leftSum = 0;
        int rightSum =0;

        for(int val : arr){
            rightSum += val;
        }

        for(int i = 0; i < n; i++){
            rightSum -= arr[i];
            if(leftSum == rightSum){
                System.out.print("Ans : " + i);
                return;
            }
            leftSum += arr[i];
        }
        System.out.println("Ans : " + (-1));
    }
}

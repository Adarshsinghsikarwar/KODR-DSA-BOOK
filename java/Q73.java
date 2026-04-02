
public class Q73 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 1, 3};
        int n = arr.length;
        int leftSum = 0;
        int rightSum = 0;

        for(int i = 0; i <= n/2 -1; i++){
            leftSum += arr[i];
            rightSum += arr[n/2+i];
        }
        System.out.println("leftSum : " + leftSum + " " + "rightSum : " + rightSum);
        if(leftSum > rightSum){
            System.out.print("Ans is : " + (leftSum - rightSum));
        }
        else {
            System.out.print("Ans is : " + (rightSum - leftSum));
        }
    }
}

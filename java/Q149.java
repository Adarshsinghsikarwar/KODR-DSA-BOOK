package java;

// Best Time to Buy and Sell Stock II
public class Q149 {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int n = arr.length;
        int bestBuy = arr[0];
        int profit = 0;

        for(int i = 1; i < n; i++){
            if(arr[i] < arr[i-1]) bestBuy = arr[i];
            else {
                int value = arr[i] - bestBuy;
                profit += value;
                bestBuy = arr[i];
            }
        }
        System.out.print("Ans : " + profit);
    }
}

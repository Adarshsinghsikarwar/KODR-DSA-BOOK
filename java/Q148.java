
// Best Time to Buy and Sell Stock (Hint - Kadane's Algo)
public class Q148 {
    public static void main(String[] args) {

        int[] arr =  {7,1,5,3,6,4};
        int n = arr.length;
        int bestBuy = arr[0];
        int profit = 0;

        for(int i = 0; i < n; i++){
            profit = Math.max(arr[i] - bestBuy , profit);
            bestBuy = Math.min(arr[i] , bestBuy);
        }

        System.out.println("Profit is : " + profit);
    }
}

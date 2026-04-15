
// Replace Elements with Greatest Element on Right Side
public class Q134 {
    public static void main(String[] args) {
       int[] arr = {17,18,5,4,6,1};

        int n = arr.length;
        int max = arr[n-1];
        arr[n-1] = -1;
        for (int i = n-2; i >= 0; i--){
            int current = arr[i];
            arr[i] = max;
            max = Math.max(current,max);
        }
       for(int val : arr){
           System.out.print(val + " ");
       }
    }
}

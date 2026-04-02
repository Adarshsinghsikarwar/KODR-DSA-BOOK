
public class Q71 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};

        int n = arr.length;

        if(n < 2){
            System.out.println("Not enough elements");
            return;
        }

        int[] ans = new int[n];
        ans[0] = arr[0] * arr[1];
        ans[n-1] = arr[n-2] * arr[n-1];


        for(int i = 1; i < n-1; i++){
            ans[i] = arr[i-1] * arr[i+1];
        }
        for(int i : ans){
            System.out.print(i + " ");
        }
    }
}

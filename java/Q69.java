

public class Q69 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,2};
        int n = arr.length;
        int [] ans = new int[n * 2];

        for(int i = 0; i < n; i++){
            ans[i] = arr[i];
            ans[n+i] = arr[i];
        }

        for(int i : ans){
            System.out.print(i + " ");
        }
    }
}

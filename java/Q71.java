
// Given an array of integers, update every element with the multiplication of previous and next elements with the following exceptions: a) The First element is replaced by the multiplication of the first and second. b) The last element is replaced by multiplication of the last and second last. (Ex: Input : arr[] = {2, 3, 4, 5, 6}, Output : arr[] = {6, 8, 15, 24, 30})

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

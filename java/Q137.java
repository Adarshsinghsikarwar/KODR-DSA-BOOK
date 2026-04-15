package java;

public class Q137 {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        int j = 0;
        int n = arr.length;

        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}

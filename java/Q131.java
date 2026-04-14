
// Remove Duplicates from Sorted Array
public class Q131 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 2};
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != arr[j]){
                j++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        for(int val : arr){
            System.out.print(val + " ");
        }
    }

}

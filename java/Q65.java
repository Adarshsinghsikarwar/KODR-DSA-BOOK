


// bubble sort
public class Q65 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                if (arr[i] > arr[j]) continue;
                else {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}

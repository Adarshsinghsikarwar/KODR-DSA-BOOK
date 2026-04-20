
// Set Mismatch
public class Q166 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        int i = 0;
        int n = arr.length;

        while(i < n){
            int correctIndex = arr[i] -1;
            if(arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else i++;
        }

        for( i = 0; i < n; i++){
            if(arr[i] != i+1){
                System.out.println("Ans is : " + arr[i] + " " + i+1);
                return;
            }
        }
        System.out.println("Ans is " + (-1) + " " + (-1));
    }
}

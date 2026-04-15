package java;

public class Q136 {
    public static void main(String[] args) {
        int j = 0;
        int[] arr = {0,1,0,3,12};
        int n = arr.length;

        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}

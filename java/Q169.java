package java;

public class Q169 {
    public static void swap (int i , int j,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        int i = 0;
        int n = arr.length;
        while (i < n){
            if (arr[i] ==i || arr[i] == n) i++;
            else swap(i,arr[i],arr);
        }
        int x= n;
        for (int j = 0; j < n; j++){
            if(arr[j] != j ) {
                x = j;
                break;
            }
        }
        System.out.println("Ans : " + x);
    }
}

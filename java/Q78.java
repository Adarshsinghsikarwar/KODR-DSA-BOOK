package java;

public class Q78 {
    public static void main(String[] args) {
        int[] arr = {3,1,2,2,2,1,3};
        int n = arr.length;
        int k = 2;
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] == arr[j] && ((i * j) % k == 0)) count++;
            }
        }
        System.out.println("The count : " + count);
    }
}

package java;

public class Q130 {
    public static void main(String[] args) {
       int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        int m = 3, n = 3;
        int k = m+n-1;
        int i = m-1;
        int j = n-1;
        while (i >= 0 && j >= 0){
            if (arr1[i] > arr2[j]){
                arr1[k] = arr1[i];
                i--;
                k--;
            }
            else {
                arr1[k] = arr2[j];
                k--;
                j--;
            }
        }
        while (j >= 0){
            arr1[k] = arr2[j];
            k--;
            j--;
        }

    }
}

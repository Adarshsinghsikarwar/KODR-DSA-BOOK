
public class Q72 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1};
        int max = Integer.MIN_VALUE;
        int delete = 0;


        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] > max){
                max = arr[i];
                delete++;
            }
        }

        System.out.println(delete);

    }
}

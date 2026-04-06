
public class Q86 {
    public static void main(String[] args) {
       int[] arr = {8, 12, 16};
       int n = arr.length;
       int max = Integer.MIN_VALUE;
       int secondMax = Integer.MIN_VALUE;

       for(int i = 0; i < n; i++){
           if(arr[i] > max){
               secondMax = max;
               max = arr[i];
           }
           else if(arr[i] > secondMax && arr[i] != max){
               secondMax = arr[i];
           }
       }
       for(int i = secondMax; i > 0; i--){
           if(max % i == 0 && secondMax % i == 0){
               System.out.println("Ans : "+i);
               break;
           }
       }
    }
}

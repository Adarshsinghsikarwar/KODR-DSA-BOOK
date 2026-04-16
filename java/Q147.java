
// Move all Negative elements to one side
public class Q147 {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        int n = arr.length;
        int[] ans = new int[n];

        int even = 0;
        int odd = 1;

        for(int i = 0; i < n; i++){
            if(arr[i] < 0){
                ans[odd] = arr[i];
                odd += 2;
            }
            else{
                ans[even] = arr[i];
                even += 2;
            }
        }

        for(int val : ans){
            System.out.print(val + " ");
        }
    }
}

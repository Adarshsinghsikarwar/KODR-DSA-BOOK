
public class Q80 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int n = arr.length;
        int ans = -1;
        for(int i = 0; i < n; i++){
            if(i % 10 == arr[i]) {
                ans = i;
                break;
            }
        }
        System.out.println("Ans is : " + ans);
    }
}

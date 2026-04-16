import java.util.ArrayList;

// greatest common divider
public class Q84 {
    public static void main(String[] args) {
        int [] arr = {2,5,6,9,10};
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        for ( int i = 0; i < n; i++){
            mx = Math.max(arr[i] , mx);
            mn = Math.min(arr[i] , mn);
        }
        int gcd = 1;
        while (mx > 0 && mn > 0){
            if (mx > mn) mx = mx % mn;
            else mn = mn % mx;
        }
        if (mn == 0) gcd = mx;
        else gcd = mn;
        System.out.println("Ans : " + gcd);
    }
}

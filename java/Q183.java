
// Valid Perfect Square
public class Q183 {
    public static void main(String[] args) {
        int n = 16;
        if (n < 2){
            System.out.print("True");
            return;
        }
        long low = 0 , high = n;
        while (low <= high){
            long mid = low + (high - low ) / 2;
            if (mid *mid == n) {
                System.out.print("True");
                return;
            }
            else if (mid * mid < n) low = mid + 1;
            else if (mid *mid > n) high = mid -1;
        }
        System.out.print("False");
    }
}


public class Q178 {

    public static void main(String[] args) {
        int n = 10, pick = 6;

        int low = 1;
        int high = n;

        while(low <= high){
            int mid = low + (high -low) / 2;

            if(mid == pick) {
                System.out.print("Ans is : " + mid);
                return;
            }
            else if (mid > pick) high = mid-1;
            else low = mid + 1;
        }
        System.out.println("Ans is : " + (-1));
    }
}

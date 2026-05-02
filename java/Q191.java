
public class Q191 {
    public static void main(String[] args) {
        int target = 1000;
        int low = 0;
        int high = 1;

        while(high < target){
            low = high;
            high *= 2;
        }

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(mid == target) {
                System.out.print("Ans is : " + mid);
                return;
            }
            else if (low < target) low = mid +1;
            else high = mid-1;
        }

    }
}

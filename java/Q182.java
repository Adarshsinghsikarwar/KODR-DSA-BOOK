package java;


// Find Smallest Letter Greater Than Target
public class Q182 {
    public static void main(String[] args) {

        char[] arr = {'c','f','j'};
        char target = 'a';
        int n = arr.length;

        int low = 0;
        int high = n - 1;
        char ans = arr[0];

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > target) {
                ans = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("Ans is : " + ans);
    }
}

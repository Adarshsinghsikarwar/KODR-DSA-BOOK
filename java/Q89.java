import java.util.Arrays;

public class Q89 {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 3};
        int n = arr.length;

        // Step 1: Count sizes
        int evenSize = (n + 1) / 2;
        int oddSize = n / 2;

        int[] even = new int[evenSize];
        int[] odd = new int[oddSize];

        // Step 2: Fill arrays
        int e = 0, o = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even[e++] = arr[i];
            } else {
                odd[o++] = arr[i];
            }
        }

        // Step 3: Sort
        Arrays.sort(even); // ascending
        Arrays.sort(odd);  // ascending

        // reverse odd for descending
        for (int i = 0; i < oddSize / 2; i++) {
            int temp = odd[i];
            odd[i] = odd[oddSize - 1 - i];
            odd[oddSize - 1 - i] = temp;
        }

        // Step 4: Put back
        e = 0;
        o = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] = even[e++];
            } else {
                arr[i] = odd[o++];
            }
        }

        // Output
        System.out.println(Arrays.toString(arr));
    }
}
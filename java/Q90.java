package java;

// Min Max Game - Array
public class Q90 {
    public static void main(String[] args) {
      int[] arr = {1,3,5,2,4,8,2,2};
        while(arr.length > 1) {
            int n = arr.length;
            int[] ans = new int[n / 2];

            for (int i = 0; i < n / 2; i++) {
                if (i % 2 == 0) {
                    ans[i] = Math.min(arr[2 * i], arr[2 * i + 1]);
                } else {
                    ans[i] = Math.max(arr[2 * i], arr[2 * i + 1]);
                }
            }
            arr = ans;
        }

        System.out.print("Ans is : " + arr[0]);
    }
}

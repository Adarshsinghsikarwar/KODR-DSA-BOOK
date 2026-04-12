import java.util.Scanner;

public class Q121 {
    public static void main(String[] args) {
        String s = "123";
        char digit = '3';

        int n = s.length();

        // Greedy approach
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == digit && s.charAt(i) < s.charAt(i + 1)) {
                System.out.println(s.substring(0, i) + s.substring(i + 1));
                return;
            }
        }

        // Fallback: remove last occurrence
        int lastIndex = s.lastIndexOf(digit);
        String result = s.substring(0, lastIndex) + s.substring(lastIndex + 1);

        System.out.println(result);
    }
}
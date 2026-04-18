import java.util.*;

// Find the Difference
public class Q162 {
    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
        int[] freq = new int[26];

        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        for(char ch : t.toCharArray()){
            freq[ch - 'a']--;
            if(freq[ch - 'a'] < 0) {
                System.out.println("Ans : " + ch);
                return;
            }
        }

        System.out.println("Bye");

    }
}

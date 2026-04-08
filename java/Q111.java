import java.util.*;

public class Q111 {
    public static void main(String[] args) {
        String  s = "anagram";
        String t = "nagaram";

        int n = s.length();
        int m = t.length();
        if(n != m){
            System.out.print("string are not anagram");
            return;
        }

        HashMap<Character,Integer> mp = new HashMap<>();
        HashMap<Character,Integer> mp1 = new HashMap<>();

        for (int i = 0;  i < n; i++) {
            char ch = s.charAt(i);
            if (!mp.containsKey(ch)) mp.put(ch, 1);

            else  mp.put(ch, mp.get(ch) + 1);
        }

        for (int i = 0;  i < n; i++) {
            char ch = t.charAt(i);
            if (!mp1.containsKey(ch)) mp1.put(ch, 1);
            else mp1.put(ch, mp1.get(ch) + 1);

        }
        if(mp.equals(mp1)){
            System.out.println("It is anagram");
        }
        else {
            System.out.println("It is not anagram");
        }
    }
}

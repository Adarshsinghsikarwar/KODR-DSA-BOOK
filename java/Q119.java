package java;

import java.util.HashMap;

public class Q119 {
    public static void main(String[] args) {
       String s = "ilovecodingonleetcode", target = "code";

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        // count frequency of s
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);
        }

        // count frequency of target
        for (int i = 0; i < target.length(); i++) {
            char ch = target.charAt(i);
            tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
        }

        int max = Integer.MAX_VALUE;

        // check how many times target can be formed
        for (char ch : tMap.keySet()) {
            if (!sMap.containsKey(ch)) {
                System.out.println("0");
                return ;
            }

            int possible = sMap.get(ch) / tMap.get(ch);
            max = Math.min(max, possible);
        }

        System.out.println("Ans is : " + max);
    }
}

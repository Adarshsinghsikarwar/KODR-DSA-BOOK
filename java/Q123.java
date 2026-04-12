

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Q123 {
    public static boolean Anagram(String a , String b){
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        String[] s= {"abba","baba","bbaa","cd","cd"};

        ArrayList<String> ans = new ArrayList<>();
        ans.add(s[0]);
        for(int i = 0; i < s.length; i++){
            if(!Anagram(ans.get(ans.size()-1) , s[i])){
                ans.add(s[i]);
            }
        }

        for(String val : ans){
            System.out.print(val + " ");
        }
    }
}

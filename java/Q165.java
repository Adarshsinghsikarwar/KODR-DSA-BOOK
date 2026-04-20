import java.util.*;

// Word Pattern
public class Q165 {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";

        String[] arr = s.split(" ");
        int n = pattern.length();

        if(arr.length != n){
            System.out.println("It is not word pattern");
            return;
        }

        HashMap<Character, String> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            char ch = pattern.charAt(i);

            if(!map.containsKey(ch)){
                if(map.containsValue(arr[i])) {
                    System.out.println("it is not a word pattern");
                    return;
                }
                map.put(ch, arr[i]);
            } else {
                if(!map.get(ch).equals(arr[i])) {
                    System.out.println("it is not a word pattern");
                    return;
                }
            }
        }
        System.out.println("it is word pattern");
    }
}

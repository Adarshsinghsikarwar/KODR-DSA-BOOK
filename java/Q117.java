import java.util.HashMap;

public class Q117 {
    public static void main(String[] args) {
        String s = "abaccb";
        int[] arr = new int[26];
        HashMap<Character , Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                int idx = ch - 'a';
                int count = map.get(ch);
                arr[idx] = i-count-1;
            }
            else {
                map.put(ch,i);
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

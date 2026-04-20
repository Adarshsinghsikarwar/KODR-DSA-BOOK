import java.util.HashMap;
import java.util.HashSet;

// Most Common Word
public class Q168 {
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        String[] arr = paragraph.split(" ");

        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> bannedSet = new HashSet<>();

        for(String word : banned){
            bannedSet.add(word);
        }

        String ans = "";
        int max = 0;

        for(int i = 0; i < arr.length; i++){
            String word = arr[i];

            if(word.equals("") || bannedSet.contains(word)) continue;

            map.put(word, map.getOrDefault(word, 0) + 1);

            if(map.get(word) > max){
                max = map.get(word);
                ans = word;
            }
        }

        System.out.println(ans);
    }
}

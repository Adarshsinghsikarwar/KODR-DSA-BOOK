import java.util.HashSet;

// Unique Morse Code Words
public class Q167 {
    public static void main(String[] args) {
       String[] words = {"gin","zen","gig","msg"};
        String[] morse = {
                ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
                "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
                "..-","...-",".--","-..-","-.--","--.."
        };
        HashSet<String> set = new HashSet<>();
        for(String word : words){
            String s = "";
            for(char ch : word.toCharArray()){
                s += morse[ch-'a'];
            }
            set.add(s);
        }
        System.out.println("Ans is : " + set.size());
    }
}

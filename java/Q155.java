package java;


// Check if the Sentence Is Pangram
public class Q155 {
    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";

        boolean[] ans = new boolean[26];
        int n = s.length();

        for(int i = 0; i < n; i++){
            int ascii = s.charAt(i) - 'a';
            ans[ascii] = true;
        }

        for(boolean val : ans){
            if(!val){
                System.out.println("not all the character of an alphabet is present inside the s ");
                return;
            }
        }

        System.out.println("All the character of an alphabet is present inside the s");
    }
}



// Sort the words of the sentence
public class Q112 {
    public static void main(String[] args) {

        String s = "is2 sentence4 This1 a3";
        String[] ans = s.split(" ");
        int n = ans.length;
        for(int i = 0; i < n; i++){
            int word = ans[i].length();
            char last = ans[i].charAt(word-1);
            int post = last - '0';
            String temp = ans[0];
            ans[0] = ans[post-1];
            ans[post-1] = temp;
        }

        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
    }
}

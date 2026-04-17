package java;

//  First Letter to Appear Twice
public class Q156 {
    public static void main(String[] args) {
        String s = "abccbaacz";
        boolean[] ans = new boolean[26];
        int n = s.length();

        for(int i = 0; i < n; i++){
            int ascci = s.charAt(i) - 'a';
            if(ans[ascci] == true){
                System.out.println("Ans : " + s.charAt(i));
                return;
            }
            else ans[ascci] = true;
        }

        System.out.println("Ans : " + s.charAt(0));
    }
}



public class Q115 {
    public static void main(String[] args) {
        String s = "abab";
        for (int i = 0; i < s.length()-1; i++){
            if (s.charAt(i) == 'b' && s.charAt(i+1) == 'a') {
                System.out.println("Wrong");
                return;
            }
        }
        System.out.println("Yes");
    }
}

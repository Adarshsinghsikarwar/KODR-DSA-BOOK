import java.util.*;

public class Q118 {
    public static void main(String[] args) {
        String s =  "lEeTcOdE";
        int n = s.length();
        String ans = "";

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);

            if(Character.isUpperCase(ch)){
                char lower = Character.toLowerCase(ch);

                if(s.contains(String.valueOf(lower))){
                    if(ans.equals("") || ch > ans.charAt(0)){
                        ans = String.valueOf(ch);
                    }
                }
            }
            else {
                char upper = Character.toUpperCase(ch);

                if(s.contains(String.valueOf(upper))){
                    if(ans.equals("") || upper > ans.charAt(0)){
                        ans = String.valueOf(upper);
                    }
                }
            }
        }
        System.out.println("ans is : " +ans);
    }
}

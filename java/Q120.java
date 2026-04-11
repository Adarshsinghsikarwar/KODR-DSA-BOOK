package java;

public class Q120 {
    public static void main(String[] args) {
        String num = "6777133339";

        String ans = "";
        for(int i = 0; i < num.length()-2; i++){
            String t = num.substring(i, i+3);
            if(t.charAt(0) == t.charAt(1) && t.charAt(1) == t.charAt(2)){
                if(t.compareTo(ans) > 0){
                    ans = t;
                }
            }
        }
        System.out.println("Ans is : " + ans);
    }
}

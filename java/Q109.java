
public class Q109 {
    public static void main(String[] args) {
        String[] arr = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

        int max = -1;

        for(String i : arr){
            int sub = i.split(" ").length;
            if(sub > max) max = sub;
        }
        System.out.println("Max : " + max);
    }
}

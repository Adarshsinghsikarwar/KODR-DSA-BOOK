package java;

//  Jewels and Stones
public class Q154 {
    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        int n = stones.length();
        int count = 0;

        for(int i = 0; i < n; i++){
            char ch = stones.charAt(i);
            if(jewels.contains(String.valueOf(ch)))  count ++;
        }

        System.out.print("Ans is : " + count);
    }
}

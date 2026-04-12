package java;

public class Q122 {
    public static void main(String[] args) {
        String num = "1210";

        int[] count = new int[10];
        for(int i = 0; i < num.length(); i++){
            int val = num.charAt(i) - '0';
            count[val]++;
        }

        for(int i = 0; i < num.length(); i++){
            int val = num.charAt(i) - '0';
            if(count[i] != val){
                System.out.println("Wrong");
                return;
            }
        }

        System.out.println("Right");
    }
}

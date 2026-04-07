import java.util.Scanner;

public class Q102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.nextLine();

        String rev = "";

        for(int i = s.length()-1; i >= 0; i--){
            rev += s.charAt(i);
        }

        if(rev.equals(s)){
            System.out.print("It is equal");
        }
        else {
            System.out.print("It is not equal");
        }


//        for(int i = 0; i < )
    }
}

import java.util.Scanner;

public class Q103 {

    public static boolean palindromic(String s){
        int i = 0;
        int j = s.length() - 1;

        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.nextLine();

        if(palindromic(s)){
            System.out.print("It is palindrome String");
        }
        else {
            System.out.println("it is not palindrome String");
        }

    }
}

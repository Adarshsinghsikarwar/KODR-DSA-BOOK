import java.util.Scanner;

public class Q105 {
    public static boolean isUpper(char ch){
        int ascii = (int) ch;
        if(ascii >= 65 && ascii <= 90){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.nextLine();

        String toggle = "";

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(isUpper(ch)){
                // convert to lowercase
                toggle += (char)(ch + 32);
            } else {
                // convert to uppercase
                toggle += (char)(ch - 32);
            }
        }

        System.out.println("Toggled String: " + toggle);
    }
}
import java.util.Scanner;

// Take an array of strings words and a String Prefix. Print the number of strings in words that contain pref as a prefix. (Example - Input: words = [\pay\"
public class Q106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"pay","attention","practice","attend"};
        System.out.print("Enter prefix : ");
        String pref = sc.nextLine();

        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i].startsWith(pref)){
                count++;
            }
        }
        System.out.println("Number of time prefix occured : " + count);
    }
}

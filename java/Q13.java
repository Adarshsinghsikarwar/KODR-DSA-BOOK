import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gender = sc.nextLine();

        if(gender.equals("male")){
            System.out.println("Good morning sir");
        }
        else  {
            System.out.println("Good morning mam");
        }
    }
}

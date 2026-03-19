import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gender = sc.nextLine();

        if(gender.equals("male")){
            System.out.println("Good morning sir");
        }
        else if (gender.equals("female"))  {
            System.out.println("Good morning mam");
        }
        else  {
            System.out.println("Wrong input");
        }
    }
}

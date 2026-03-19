

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name  = sc.nextLine();
        int age = sc.nextInt();

        if (age < 18){
            System.out.println("Hello "+name + "You are valid voter");
            System.out.println("After " + (18 - age) + "you will be eligible for vote" );
        }
        else {
            System.out.println("Hello "+name + "You are not a valid voter");
        }

    }
}

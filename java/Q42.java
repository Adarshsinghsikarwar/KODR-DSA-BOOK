package java;

import java.util.Scanner;

public class Q42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter required day : ");
        int val = sc.nextInt();
        int day = -1;
        do{
            System.out.print("Enter day : ");
            day = sc.nextInt();

            switch (day){
                case 0 :
                    System.out.print("It is sunday");
                    break;
                case 1:
                    System.out.print("it is monday");
                    break;
                case 2:
                    System.out.print("It is tuesday");
                    break;
                case 3:
                    System.out.println("It is wednesday");
                    break;
                case 4 :
                    System.out.print("It is Thursday");
                case 5 :
                    System.out.print("it is Friday");
                case 6 :
                    System.out.print("It is saturday");
            }
        } while (val != day);

        System.out.print("Correct");

    }
}

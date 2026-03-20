import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float unit = sc.nextFloat();
        if(unit >= 0 && unit <= 100){
            System.out.println("your bill : "+ unit *4.2);
        }
        else if (unit >= 101  && unit <= 200){
            System.out.println("your bill : " + unit *6);
        }
        else if (unit >= 201 && unit <= 400){
            System.out.println("your bill : " + unit*8);
        }
        else {
            System.out.println("your bill : " + unit *13);
        }
    }
}

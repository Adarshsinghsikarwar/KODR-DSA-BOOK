
import java.util.Arrays;

// Minimum Number of Seat Everyone
public class Q91 {
    public static void main(String[] args) {
        int[] seats = {3,1,5};
        int[] students = {2,7,4};
        Arrays.sort(seats);
        Arrays.sort(students);
        int n = seats.length;
        int move = 0;

        for(int i = 0; i < n; i++){
            move += Math.abs(seats[i] - students[i]);
        }

        System.out.println("numbers of moves : " + move);

    }
}

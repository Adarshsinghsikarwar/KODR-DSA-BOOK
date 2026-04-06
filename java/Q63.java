import java.util.Scanner;

//Binary Search. If element found print the index, else -1
public class Q63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        int[] a = {1,2,3,4,5,6,7,8,9};

        int low = 0;
        int high = a.length - 1;

        while(low <= high){
            int mid = (high + low) / 2;

            if(a[mid] == target){
                System.out.println("found the number at  : " + mid);
                return;
            }
            else if(a[mid] < target){
                high = mid -1;
            }
            else {
                low = mid+1;
            }
        }
    }
}

import java.util.Scanner;

public class Q98 {
    public static void main(String[] args) {
       int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        int n = arr.length-1;
        int i = 0;
        int j = n;

        while(i < n && j > 0){
            if(arr[i][j] == target){
                System.out.print("Found");
                return;
            }
            else if(arr[i][j] > target){
                j--;
            }
            else {
                i++;
            }
        }
        System.out.print("Not found");
    }
}

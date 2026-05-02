
// Search a 2D Matrix
public class Q192 {
    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 13;
        int n = arr.length;
        int m = arr[0].length;

        int i = 0;
        int j = m-1;
        while(i < n && m > 0){
            if(arr[i][j] == target){
                System.out.print("True");
                return;
            }
            else if(arr[i][j] > target) j--;
            else i++;
        }
        System.out.println("False");
    }
}

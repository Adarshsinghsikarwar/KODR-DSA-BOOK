

public class Q92 {
    public static void main(String[] args) {
        int[][] arr ={{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int m = arr.length;
        int n = arr[0].length;
        int sum = 0;

        for(int i =0; i < m; i++ ){
            for(int j = 0; j < n; j++){
                if(i == j || i + j == n-1) sum += arr[i][j];
            }
        }
        System.out.print("Sum is : " + sum);
    }
}



public class Q94 {
    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        int n = arr.length;

        for(int i = 0; i < n; i++){
            int j = 0;
            int k = arr.length-1;

            while(j < k){
                int temp = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = temp;
                j++;
                k--;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] == 0){
                    arr[i][j] = 1;
                }
                else {
                    arr[i][j] = 0;
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j =0; j < n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

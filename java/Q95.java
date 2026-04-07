

public class Q95 {
    public static void main(String[] args) {
        int[][] mat = {{0,1},{1,0}};
        int[][] target = {{1,0},{0,1}};
        int n = mat.length;

        for(int i = 0; i < n; i++){
            int j = 0;
            int k = mat.length-1;

            while(j < k){
                int temp = mat[i][j];
                mat[i][j] = mat[i][k];
                mat[i][k] = temp;
                j++;
                k--;
            }
        }

        for(int i = 0; i < mat.length;i++){
            for(int j = 0; j < mat.length; j++){
                if(mat[i][j] != target[i][j]){
                    System.out.print("mat is not equal to target");
                    return;
                }
            }
        }
        System.out.print("mat is equal to target");
    }
}

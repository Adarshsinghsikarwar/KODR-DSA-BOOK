
public class Q70 {
    public static void main(String[] args) {
        int[] A = {3,2,5,4};
        char[] B = {'a','b','c','a'};
        int n = A.length;

        int sumA = 0;
        int sumB = 0;
        int sumC = 0;

        for(int i = 0; i < n; i++){
            if(B[i] == 'a') sumA += A[i];
            else if(B[i] == 'b') sumB += A[i];
            else {
                sumC += A[i];
            }
        }
        int option1 = sumA + sumB;
        int option2 = sumC;

        System.out.println("Min value : "+ Math.min(option1 ,option2));
    }
}

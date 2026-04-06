// Find the second greatest element (Ex: {2, 96, 69, 77, 145, 20} = Second greatest element = 96)


public class Q56 {
    public static void main(String[] args) {
        int[] arr = {2, 96, 69, 77, 145, 20};
        int max = Integer.MIN_VALUE;
        int secondMax = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            else if(secondMax != max && arr[i] > secondMax){
                secondMax = max;
            }
        }

        System.out.println("Maximum number : " +max);
        System.out.print("Second Maximum number : " + secondMax);
    }
}

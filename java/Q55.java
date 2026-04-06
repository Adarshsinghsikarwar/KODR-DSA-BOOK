
//Find the greatest element (Ex: {2, 96, 69, 77, 145, 20} = Max element = 145 found at 4 index)

public class Q55 {
    public static void main(String[] args) {
        int[] arr = {2,96,69,77,145,20};
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
            max = Math.max(arr[i], max);
        }
        System.out.print("Maximum number : "+ max);
    }
}

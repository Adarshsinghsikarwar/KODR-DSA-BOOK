
public class Q57 {
    public static void main(String[] args) {
        int[] arr =  { 1, 5, 8, 9, 10, 15 };

        boolean flag = false;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[i-1]) {
                flag = true;
            }
            else {
                flag = false;
            }
        }
        if(flag == true){
            System.out.print("it is sorted");
        }
        else {
            System.out.println("it is not sorted ");
        }
    }
}

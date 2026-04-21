

public class Q173 {
    public static void swap(int i , int j , int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int n = arr.length;
        while (true){
            int ele = arr[0];
            if (arr[ele] == ele){
                System.out.print("Ele : " + ele);
                return;
            }
            else swap(0,ele,arr);
        }
    }
}

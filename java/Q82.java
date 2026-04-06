import java.util.HashSet;

public class Q82 {
    public static void main(String[] args) {
        int[] arr = {1,5,0,3,5};
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0 && !set.contains(arr[i])){
                set.add(arr[i]);
            }
        }

//        for(int i : arr){
//            System.out.print(i);
//        }
        System.out.println("ans is : " + set.size());
    }
}

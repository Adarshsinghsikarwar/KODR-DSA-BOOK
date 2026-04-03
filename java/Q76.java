import java.util.HashMap;

public class Q76 {
    public static void main(String[] args) {
        int[] arr = {3,2,3,2,2,2,1};
        int n = arr.length;
        HashMap<Integer , Integer>  map= new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i] , 1);
            }
        }

        for(int i : map.values()){
            if(i % 2 != 0){
                System.out.println("You can not divide it into two equal part");
                return;
            }
        }

        System.out.println("You can divide it into two equal part");

    }
}

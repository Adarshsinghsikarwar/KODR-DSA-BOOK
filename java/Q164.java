

//Kth Distinct String in an Array

import java.util.HashMap;

public class Q164 {
    public static void main(String[] args) {
        String[] arr ={"d","b","c","b","c","a"};
        int k = 2;
        int n = arr.length;
        int count = 0;
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0) + 1);
        }
        for(int i = 0; i < n; i++){
            int val = map.get(arr[i]);
            if(val == 1){
                count++;
                if(count == k){
                    System.out.println("Ans : " + arr[i]);
                    return;
                }
            }
        }
        System.out.println("there was not string exist");

    }
}

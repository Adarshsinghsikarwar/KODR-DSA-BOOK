package java;

import java.util.ArrayList;
import java.util.HashMap;

// Frequency of Elements
public class Q153 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 5};
        int n= arr.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < n; i++){
            map.put(arr[i] ,map.getOrDefault(arr[i] , 0) + 1);
        }

        for(int val : map.keySet()){
            ArrayList<Integer> a = new ArrayList<>();
            a.add(val);
            a.add(map.get(val));
            ans.add(a);
        }

        System.out.print("Ans : " + ans);
    }
}

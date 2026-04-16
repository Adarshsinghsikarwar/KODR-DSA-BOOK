

import java.util.*;

// 3Sum
public class Q146 {
    public static void main(String[] args) {
        int[] arr ={-1,0,1,2,-1,-4};
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        for(int i = 0; i < n-2; i++){
            if(i > 0 && arr[i] == arr[i-1]) continue;
            int j = i+1;
            int k = n-1;
            while(j < k){

                int sum = arr[i] + arr[j] + arr[k];
                if(sum == 0){
                    List<Integer> a = new ArrayList<>();
                    a.add(arr[i]);
                    a.add(arr[j]);
                    a.add(arr[k]);
                    ans.add(a);
                    j++; k--;
                    while(j < k && arr[j] == arr[j-1]) j++;
                }
                else if (sum < 0) j++;
                else k--;
            }
        }

        System.out.println("Ans : " + ans);
    }
}

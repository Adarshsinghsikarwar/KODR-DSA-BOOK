import java.util.ArrayList;

public class Q85 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 3, 3, 2};
        ArrayList<Integer> num = new ArrayList<>();
        int count = 0;


        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                num.add(arr[i]);
            }
        }

        num.add(arr[0]);

        for(int i = 1; i < num.size()-1; i++){
            if((num.get(i) > num.get(i-1) && num.get(i) > num.get(i+1)) || (num.get(i) < num.get(i-1) && num.get(i) < num.get(i+1))){
                count++;
            }
        }
        System.out.print("Count : " + count );

    }
}

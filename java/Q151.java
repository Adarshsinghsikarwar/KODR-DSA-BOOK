
// Container With Most Water
public class Q151 {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int n = arr.length;
        int i = 0;
        int j = n-1;
        int ans = 0;

        while(i < j){
            int width = j-i;
            int hieght = Math.min(arr[i] , arr[j]);
            int area = hieght * width;
            ans = Math.max(area, ans);

            if(arr[i] < arr[j]) i++;
            else j--;

        }

        System.out.println("Ans is : " + ans);
    }
}

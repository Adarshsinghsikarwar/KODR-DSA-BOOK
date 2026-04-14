package java;
// Valid Mountain Array
public class Q133 {
    public static void main(String[] args) {
        int[] arr =  {3,5,5};
        int n = arr.length;
        if (n < 3)
        {
            System.out.println("Wrong");
            return;
        }

        int i = 0;

        // go up
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        // peak should not be first or last
        if (i == 0 || i == n - 1) {
            System.out.println("Wrong");
            return;
        }

        // go down
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        if(i== n-1){
            System.out.println("true");
        }
        else {
            System.out.println("Wrong");

        }

    }
}

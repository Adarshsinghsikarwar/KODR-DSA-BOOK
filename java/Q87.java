
public class Q87 {
    public static void main(String[] args) {
        int[] arr = {-5, 1, 5, 0, -7};

        int maxAltitude = 0;
        int currentAltitude = 0;

        for(int i = 0; i < arr.length; i++){
            currentAltitude += arr[i];
            if(currentAltitude > maxAltitude){
                maxAltitude = currentAltitude;
            }
        }
        System.out.print("maxAltitude is : " + maxAltitude);
    }
}



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q158 {
    public static void main(String[] args) {
       String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        int n = names.length;

        // Pair: height + name
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new int[]{heights[i], i}); // store index
        }

        // Sort descending by height
        Collections.sort(list, (a, b) -> b[0] - a[0]);

        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            result[i] = names[list.get(i)[1]];
        }

        System.out.println("Ans : "+ result);

    }
}

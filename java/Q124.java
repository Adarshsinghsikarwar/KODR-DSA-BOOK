
public class Q124 {
    public static void main(String[] args) {
        String s = "11111222223";
        int k = 3;

        while (s.length() > k) {

            StringBuilder newStr = new StringBuilder();

            for (int i = 0; i < s.length(); i += k) {

                int sum = 0;

                // group ka sum nikaalna
                for (int j = i; j < Math.min(i + k, s.length()); j++) {
                    sum += s.charAt(j) - '0';
                }

                // sum ko string me add karna
                newStr.append(sum);
            }

            // next iteration ke liye update
            s = newStr.toString();
        }

        return s;
    }
}

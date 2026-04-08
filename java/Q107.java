public class Q107 {
    public static void main(String[] args) {
        String s = "hello bhai kaise ho";
        String result = "";

        boolean capitalize = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                result += ch;
                capitalize = true;
            } else if (capitalize) {
                result += Character.toUpperCase(ch);
                capitalize = false;
            } else {
                result += ch;
            }
        }

        System.out.println(result);
    }
}
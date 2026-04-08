public class Q108 {
    public static void main(String[] args) {
        String s = "hello bhai kaise ho";
        String startEnd = "";
        boolean capitalize = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                // capitalize last character of previous word
                char last = startEnd.charAt(startEnd.length() - 1);
                startEnd = startEnd.substring(0, startEnd.length() - 1)
                        + Character.toUpperCase(last);

                startEnd += ch;
                capitalize = true;
            }
            else if (capitalize) {
                startEnd += Character.toUpperCase(ch);
                capitalize = false;
            }
            else {
                startEnd += ch;
            }
        }

        // Handle last word ka last character
        char last = startEnd.charAt(startEnd.length() - 1);
        startEnd = startEnd.substring(0, startEnd.length() - 1)
                + Character.toUpperCase(last);

        System.out.println("Ans string is : " + startEnd);
    }
}
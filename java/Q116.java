

public class Q116 {
    public static void main(String[] args) {
        String s = "lovee3tcode!";
        if(s.length() < 8) {
            System.out.println("It is not strong password");
            return;
        }

        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        String special = "!@#$%^&*()-+";

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isLowerCase(ch)) hasLower = true;
            else if(Character.isUpperCase(ch)) hasUpper = true;
            else if(Character.isDigit(ch)) hasDigit = true;
            else if(special.contains(ch + "")) hasSpecial = true;

            // check adjacent same
            if(i > 0 && ch == s.charAt(i - 1)) {
                System.out.println("It is not strong password");
                return;
            }
        }

        if(hasLower && hasUpper && hasDigit && hasSpecial){
            System.out.println("It is  strong password");
            return;
        }
        System.out.println("It is wrong strong password ");
    }
}

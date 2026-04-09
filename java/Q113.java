

public class Q113 {
    public static void main(String[] args) {
        String s = "l|*e*et|c**o|*de|";
        boolean pipe = false;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '|'){
                if(pipe){
                    pipe = false;
                }
                else {
                    pipe = true;
                }
            }
            else if(!pipe){
                if(s.charAt(i) == '*'){
                    count++;
                }
            }
        }

        System.out.println("Ans is : " + count);
    }
}

package String;

public class LengthOfLastWord_58 {
    public static int lengthOfLastWord(String s){
        s = s.trim();
        if (s.length()==0)
            return 0;
        int count = 0;
        for (int i = s.length()-1; i >= 0; i--){
            if (s.charAt(i) != ' ')
                count++;
            else
                break;
        }
        return count;
    }
    public static void main(String[] args){
        String s = "Hello World World";
        System.out.println(lengthOfLastWord(s));
    }
}

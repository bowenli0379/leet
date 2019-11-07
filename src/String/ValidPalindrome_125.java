package String;

public class ValidPalindrome_125 {
    public static boolean isPalindrome(String s){
        if (s == null || s.length() == 0) return true;
        int i = 0, j = s.length()-1;
        s = s.toLowerCase();
        while (i < j){
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}

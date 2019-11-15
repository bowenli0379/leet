package String;

public class FlipGameII_294 {
    public static boolean canWin(String s){
        for (int i = 1; i < s.length(); i++)
            if (s.charAt(i) == '+' && s.charAt(i-1)=='+' && (!canWin(s.substring(0,i-1)+"--"+s.substring(i+1)))){
                return true;
            }
        return false;
    }
    public static void main(String[] args){
        String s = "++--";
        System.out.println(canWin(s));
    }
}

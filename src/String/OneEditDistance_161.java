package String;

public class OneEditDistance_161 {
    public static boolean isOneEditDistance(String s, String t){
        int m = s.length(), n = t.length();
        for (int i = 0; i < Math.min(m, n); i++){
            if (s.charAt(i) != t.charAt(i)){
                if (m == n) return s.charAt(i+1) == t.charAt(i+1);
                if (m < n) return s.charAt(i) == t.charAt(i+1);
                else return s.charAt(i+1) == t.charAt(i);
            }
        }
        return Math.abs(m-n) == 1;
    }
    public static void main(String[] args){
        String s = "ab";
        String t = "acb";
        System.out.println(isOneEditDistance(s, t));
    }
}

package String;

import java.util.Arrays;

public class CountAndSay_38 {
    public static String countAndSay (int n){
        if ( n <= 0) return "";
        String res = "1";
        while (n>0){
            String cur = "";
            for (int i = 0; i <= res.length(); i++){
                int cnt = 1;
                if (i+1 < res.length() && res.charAt(i) == res.charAt(i+1)){
                    cnt++;
                    i++;

                }
                cur += Integer.toString(cnt) + res.charAt(i);
            }
            res = cur;
            n--;
        }
        return res;
    }
    public static void main(String[] args){
        int n = 5;
        System.out.println(countAndSay(n));
    }
}

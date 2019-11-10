package String;

import java.util.Arrays;

public class CountAndSay_38 {
    public static String countAndSay (int n){

        if(n == 1){
            return "1";
        }
        String str = countAndSay(n-1) + "*";
        char[] c = str.toCharArray();
        int count = 1;
        String res = "";
        for(int i = 0; i < c.length - 1;i++){
            if(c[i] == c[i+1]){
                count++;
            }else{
                res = res + count + c[i];
                count = 1;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int n = 5;
        System.out.println(countAndSay(n));
    }
}

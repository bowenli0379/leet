package String;

import java.util.Arrays;

public class ReverseWordsInAStringII_186 {
    public static char[] reverseWords(char[] s){ // String 是 immutable，所以需要用char array来做；
        reverse(s, 0, s.length);
        for (int i = 0, j = 0; j<s.length; j++ ){
            if (s.length == 0 || s[j] == ' ') {
                reverse(s, i, j);
                i = j + 1;
            }
        }
        return s;
    }
    public static void reverse(char[] s, int start, int end){
        for (int i = 0; i < (end-start)/2; i++){
            char temp = s[start+i];
            s[start+i] = s[end-1-i];
            s[end-1-i] = temp;
        }
    }
    public static void main(String[] args){
        char [] s = {' ','t', 'h','e',' ','s', 'k','y'};
        System.out.println(reverseWords(s));
    }
}


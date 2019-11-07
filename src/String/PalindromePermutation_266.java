package String;

import java.util.HashSet;

public class PalindromePermutation_266 {
    public static boolean canPermutePalindrome(String s){
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++){
            if (set.contains(s.charAt(i)))
                set.remove(s.charAt(i));
            else
                set.add(s.charAt(i));
        }
        return set.size() <= 1;
    }
    public static void main(String[] args){
        String s = "carerac";
        System.out.println(canPermutePalindrome(s));
    }
}

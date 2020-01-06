package Math;

public class PalindromeNumber_009 {
    public static boolean isPalindrome(int x){
        if (x < 0 || (x!= 0 && x % 10 == 0))
            return false;
        int res = 0;
        while (x > res){
            res = res * 10 + x % 10;
            x = x / 10;
        }
        if (x == res || x == res / 10)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        int x1 = 121;
        int x2 = -121;
        int x3 = 10;
        System.out.println(isPalindrome(x1));
        System.out.println(isPalindrome(x2));
        System.out.println(isPalindrome(x3));
    }
}

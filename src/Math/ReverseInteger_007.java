package Math;

public class ReverseInteger_007 {
    public static int reverse(int x){
        int res = 0;
        while (x != 0){
            res = res * 10 + x % 10;
            x = x / 10;
        }
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
            return 0;
        return res;
    }
    public static void main(String[] args){
        int x1 = 123;
        int x2 = -123;
        System.out.println(reverse(x1));
        System.out.println(reverse(x2));
    }
}

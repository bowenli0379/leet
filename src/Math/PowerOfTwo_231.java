package Math;

public class PowerOfTwo_231 {
    public static boolean isPowerOfTwo(int n){
        if (n == 1)
            return true;
        if (n >= 2 && n % 2 == 0)
            return isPowerOfTwo(n / 2);
        return false;
    }
    public static void main(String[] args){
        int n1 = 1;
        int n2 = 16;
        int n3 = 218;
        System.out.println(isPowerOfTwo(n1));
        System.out.println(isPowerOfTwo(n2));
        System.out.println(isPowerOfTwo(n3));
    }
}

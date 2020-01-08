package Math;

public class FactorialTrailingZeroes_172 {
    public static int trailingZeroes(int n){
        int res = 0;
        while (n > 0){
            n = n / 5;
            res += n;
        }
        return res;
    }
    public static void main(String[] args){
        int n1 = 3;
        int n2 = 5;
        System.out.println(trailingZeroes(n1));
        System.out.println(trailingZeroes(n2));
    }
}

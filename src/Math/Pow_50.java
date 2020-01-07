package Math;

public class Pow_50 {
    public static double myPow(double x, int n){
        double res = 1;
        if(n > 0){
            for (int i = 0; i < n; i++){
                res *= x;
            }
        }
        if (n < 0){
            for (int i = 0; i < Math.abs(n); i++){
                res *= x;
            }
            res = 1 / res;
        }
        return res;
    }
    public static void main(String[] args){
        double x1 = 2.0000;
        int n1 = 10;
        double x2 = 2.10000;
        int n2 = 3;
        double x3 = 2.0000;
        int n3 = -2;
        System.out.println(myPow(x1, n1));
        System.out.println(myPow(x2, n2));
        System.out.println(myPow(x3, n3));
    }
}

package Math;

public class Sqrt_69 {
    public static int mySqrt(int x){
        int l = 0;
        int r = x;
        int mid = 0;
        while (l < x){
            mid = (l + r) / 2;
            if (mid * mid <= x && x < (mid+1) * (mid+1)){
                return mid;
            }
            if (x < mid * mid)
                r = mid - 1;
            if (x > mid * mid)
                l = mid + 1;
        }
        return mid;
    }
    public static void main(String[] args){
        int x1 = 4;
        int x2 = 8;
        System.out.println(mySqrt(x1));
        System.out.println(mySqrt(x2));
    }
}

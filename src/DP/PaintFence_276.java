package DP;

public class PaintFence_276 {
    public static int numWays(int n, int k){
        if (n == 0)
            return 0;
        int same = 0, diff = k, res = same + diff;
        for (int i = 2; i <= n; i++){
            same = diff;
            diff = res * (k-1);
            res = same + diff;
        }
        return res;
    }
    public static void main(String[] args){
        int n = 5, k = 5;
        System.out.println(numWays(n,k));
    }
}

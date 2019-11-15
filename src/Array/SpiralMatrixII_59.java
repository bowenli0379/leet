package Array;

import java.util.Arrays;

public class SpiralMatrixII_59 {
    public static int[][] generateMatrix(int n){
        int[][] res = new int[3][3];
        if (n == 0)
            return res;
        int up = 0, down = n-1, left = 0, right = n-1;
        int count = 1;
        while (left <= right && up <= down){
            for (int i = left; i <= right; i++) {
                res[up][i] = count;
                count++;
            }up++;

            for (int i = up; i <= down; i++){
                res[i][right] = count;
                count++;
            }right--;

            for (int i = right; i >= left; i--){
                res[down][i] = count;
                count++;
            }down--;

            for (int i = down; i >= up; i--){
                res[i][left] = count;
                count++;
            }left++;
        }
        return res;
    }
    public static void main(String[] args){
        int n = 3;
        for (int i = 0; i < n; i++)
            System.out.println(Arrays.toString(generateMatrix(n)[i]));
    }
}

package Array;

public class SearchA2DMatrixII_240 {
    public static boolean searchMatrix(int[][] matrix, int target){
        int m = matrix.length, n = matrix[0].length;
        int i = 0, j = n-1;
        while (i < m && j >=0){
            if (matrix[i][j] == target)
                return true;
            if (matrix[i][j] > target)
                j--;
            else
                i++;
        }
        return false;
    }
    public static void main(String[] args){
        int[][] matrix = {
            {1,4,7,11,15},
            {2,5,8,12,19},
            {3,6,9,16,22},
            {10,13,14,17,24},
            {18,21,23,26,30}
        };
        int target1 = 5;
        int target2 = 20;
        System.out.println(searchMatrix(matrix, target1));
        System.out.println(searchMatrix(matrix, target2));
    }
}

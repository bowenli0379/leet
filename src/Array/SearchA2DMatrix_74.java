package Array;

public class SearchA2DMatrix_74 {
    public static boolean searchMatrix(int[][] matrix, int target){
        int m = matrix.length, n = matrix[0].length, mid = 0, value = 0;
        int left = 0, right = m * n - 1;
        while (left <= right){
            mid = (left + right) / 2;
            value = matrix[mid/n][mid%n];
            if (value == target)
                return true;
            if (value > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 59}
        };
        int target1 = 3;
        int target2 = 13;
        System.out.println(searchMatrix(matrix,target1));
        System.out.println(searchMatrix(matrix,target2));
    }
}

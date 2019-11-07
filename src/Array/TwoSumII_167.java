package Array;

public class TwoSumII_167 {
    public static int [] twoSum(int[] numbers, int target){
        int[] res = new int[2];
        int i = 0;
        int j = numbers.length-1;
        while (i < j){
            if (numbers[i] + numbers[j] == target){
                res[0] = i+1;
                res[1] = j+1;
            }
            if (numbers[i] + numbers[j] > target)
                j--;
            else
                i++;
        }
        return res;
    }
    public static void main(String[] args){
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(twoSum(numbers, target));
    }
}

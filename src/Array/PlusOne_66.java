package Array;

import java.util.Arrays;

public class PlusOne_66 {
    public static int[] plusOne(int[] digits){
        int len = digits.length;
        for (int i = len-1; i >=0; i--){
            if (digits[i] < 9){
                digits[i] += 1;
                return digits;
            }
            else
                digits[i] = 0;
        }
        int[] newNum = new int[len+1];
        newNum[0] = 1;
        return newNum;
    }
    public static void main(String[] args){
        int[] digits = {1,2,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}

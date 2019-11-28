package Array;

import java.util.Arrays;

public class Candy_135 {
    public static int candy(int[] ratings){
        int[] candy = new int[ratings.length];
        Arrays.fill(candy, 1);
        for (int i = 1; i < ratings.length; i++){
            if (ratings[i] > ratings[i-1]){
                candy[i] = candy[i-1] + 1;
            }
        }
        int sum = candy[ratings.length-1];
        for (int i = ratings.length-2; i >= 0; i--){
            if (ratings[i] > ratings[i+1] && candy[i] <= candy[i+1])
                candy[i] = candy[i+1] + 1;
            sum += candy[i];
        }
        return sum;
    }
    public static void main(String[] args){
        int[] ratings1 = {1,0,2};
        int[] ratings2 = {1,2,2};
        System.out.println(candy(ratings1));
        System.out.println(candy(ratings2));
    }
}

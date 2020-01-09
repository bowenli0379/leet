package Math;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber_202 {
    public static boolean isHappy(int n){
        List<Integer> list = new ArrayList<>();
        return help(list, n);
    }
    public static boolean help(List<Integer> list, int n){
        int sum = 0;
        list.add(n);
        while (n != 0){
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }
        if (sum == 1)
            return true;
        else if (list.contains(sum))
            return false;
        else
            return help(list, sum);
    }
    public static void main(String[] args){
        int n = 19;
        System.out.println(isHappy(n));
    }
}

package Array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle_118 {
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> res = new ArrayList<>();
        if (numRows <= 0)
            return res;
        List<Integer> pre = new ArrayList<>();
        pre.add(1);
        res.add(pre);
        for (int i = 1; i < numRows; i++){
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            for (int j = 1; j < i; j++){
                cur.add(pre.get(j) + pre.get(j-1));
            }
            cur.add(1);
            res.add(cur);
            pre = cur;
        }
        return res;
    }
    public static void main(String[] args){
        int numRows = 5;
        System.out.println(generate(numRows));
    }
}

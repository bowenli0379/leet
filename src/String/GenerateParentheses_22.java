package String;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses_22 {
    public static List<String> generateParentheses(int n){
        List<String> res = new ArrayList<>();
        helper (n, n, "", res);
        return res;
    }
    static void helper(int left, int right, String path, List<String> res){
        if (left < 0 || right < 0 || left > right) return;
        if (left == 0 && right == 0) {
            res.add(path);
            return;
        }
        helper (left -1, right, path+"(", res);
        helper (left, right - 1, path+")", res);
    }
    public static void main(String[] args){
        int n = 3;
        System.out.println(generateParentheses(n));
    }
}

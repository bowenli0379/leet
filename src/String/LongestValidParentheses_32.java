package String;

import java.util.Stack;

public class LongestValidParentheses_32 {
    public static int longestValidParentheses(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int start = 0, res = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                stack.push(i);
            else if (s.charAt(i) == ')') {
                if (stack.isEmpty())
                    start = i + 1;
                else {
                    stack.pop();
                    if (stack.isEmpty())
                        res = Math.max(res, i - start + 1);
                    else
                        res = Math.max(res, i - stack.peek());
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        String s = ")()())";
        System.out.println(longestValidParentheses(s));
    }

}

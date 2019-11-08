package String;

import java.util.Stack;

public class ValidParentheses_20 {
    public static boolean isValid(String s){
        if (s.length() % 2 == 1) return false;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            if (stack.isEmpty()) return false;
            else if (c == ')' && stack.pop() != '(') return false;
            else if (c == ']' && stack.pop() != '[') return false;
            else if (c == '}' && stack.pop() != '{') return false;

        }
        return stack.isEmpty();
    }
    public static void main(String[] args){
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
}

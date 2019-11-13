package String;

import java.util.ArrayList;
import java.util.List;

public class FlipGame_293 {
    public static List<String> generatePossibleNextmoves(String s){
        List<String> res = new ArrayList<>();
        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i) == '+' && s.charAt(i-1) == '+')
                res.add(s.substring(0,i-1) + "--" + s.substring(i+1));
        }
        return res;
    }
    public static void main(String[] args){
        String s = "++++";
        System.out.println(generatePossibleNextmoves(s));
    }
}

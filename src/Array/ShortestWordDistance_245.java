package Array;

import java.util.ArrayList;
import java.util.List;

public class ShortestWordDistance_245 {
    public static int shortestDistance(List<String> words, String word1, String word2){
        int p1 = -1;
        int p2 = -1;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < words.size(); i++){
            if (words.get(i).equals(word1)){
                if (word1.equals(word2))
                    p1 = p2;
                else
                    p1 = i;
            }
            if (words.get(i).equals(word2))
                p2 = i;
            if (p1 != -1 && p2 != -1)
                res = Math.min(res, Math.abs(p1 - p2));
        }
      return res;
    }
    public static void main (String[] args){
        List<String> words = new ArrayList<>();
        words.add("practice");
        words.add("makes");
        words.add("perfect");
        words.add("coding");
        words.add("makes");
        String word1 = "coding", word3 = "makes";
        System.out.println(shortestDistance(words, word1,word3));
        System.out.println(shortestDistance(words, word3,word3));

    }
}

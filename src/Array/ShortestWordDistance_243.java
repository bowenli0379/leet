package Array;

import java.util.ArrayList;
import java.util.List;

public class ShortestWordDistance_243 {
    public static int shortestDistance1(List<String> words, String word1, String word2){
        List<Integer> index1 = new ArrayList<>();
        List<Integer> index2 = new ArrayList<>();
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < words.size();i++){
            if (words.get(i) == word1)
                index1.add(i);
            if (words.get(i) == word2)
                index2.add(i);
        }

        for (int i = 0; i < index1.size();i++)
            for (int j = 0; j < index2.size(); j++){
               res = Math.min(res, Math.abs(index1.get(i) - index2.get(j)));
            }

        return res;
    }

    public static int shortestDistance2(List<String> words, String word1, String word2) {
        int p1 = -1;
        int p2 = -1;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i) == word1)
                p1 = i;
            if (words.get(i) == word2)
                p2 = i;
        }
        if (p1 != -1 && p2 != -1)
            res = Math.min(res, Math.abs(p1-p2));
        return res;
    }
    public static void main (String[] args){
        List<String> words = new ArrayList<>();
        words.add("practice");
        words.add("makes");
        words.add("perfect");
        words.add("coding");
        words.add("makes");
        String word1 = "coding", word2 = "practice", word3 = "makes";
        System.out.println(shortestDistance1(words, word1,word2));
        System.out.println(shortestDistance1(words, word1,word3));

        System.out.println(shortestDistance2(words, word1,word2));
        System.out.println(shortestDistance2(words, word1,word3));

    }
}

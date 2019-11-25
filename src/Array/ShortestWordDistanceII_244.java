package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// the list of words and method will be called repeatedly
// HashMap
public class ShortestWordDistanceII_244 {
    public static int shortestDistance(List<String> words, String word1, String word2){
        List<Integer> index1 = new ArrayList<>();
        List<Integer> index2 = new ArrayList<>();
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < words.size(); i++){
            if (words.get(i) == word1)
                index1.add(i);
            if (words.get(i) == word2)
                index2.add(i);
        }
        for (int i = 0; i < index1.size(); i++){
            for (int j = 0; j < index2.size(); j++)
                res = Math.min(res, Math.abs(index1.get(i)-index2.get(j)));
        }
        return res;
    }
    public static void main(String[] args){
        List<String> words = new ArrayList<>();
        words.add("practice");
        words.add("makes");
        words.add("perfect");
        words.add("coding");
        words.add("makes");
        String word1 = "coding", word2 = "practice", word3 = "makes";
        System.out.println(shortestDistance(words, word1,word2));
        System.out.println(shortestDistance(words, word1,word3));
    }
}

package String;

import java.util.*;

public class GroupAnagrams_49 {
    public static List<List<String>> groupAnagrams(String[] strs){
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs){
            //将每个单独的str转化为char
            char[] chars = str.toCharArray();
            //将char排序（按字母先后顺序）
            Arrays.sort(chars);
            //再将char转为string
            String sortStr = String.valueOf(chars);
            //映射到map中
            if (!map.containsKey(sortStr))
                map.put(sortStr,new ArrayList<>());
            map.get(sortStr).add(str);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args){
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
}

package String;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings_271 {
    public String encode(List<String> strs){
        if (strs == null || strs.size() == 0){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String s : strs){
            sb.append(s.length());
            sb.append('/');
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String s){
        List<String> res = new ArrayList<>();
        if (s == null || s.length() == 0)
            return res;
        int index = 0; // 是字符串len的位置；
        while (index < s.length()){
            int forwardSlashIndex = s.indexOf('/',index);
            int len = Integer.parseInt(s.substring(index, forwardSlashIndex));
            res.add(s.substring(forwardSlashIndex+1, forwardSlashIndex+1+len));
            index = forwardSlashIndex + 1 + len;
        }
        return res;
    }
}

package String;

public class ReverseWordsInAString_151 {
    public static String reverseWods(String s){
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder(words[words.length-1]);//sb的第0个元素为最后一个单词
        for(int i = words.length-2; i >= 0; i--){
            sb.append(" " + words[i]);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String s = "the sky is blue";
        System.out.println(reverseWods(s));
    }
}

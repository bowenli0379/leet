package Math;

public class ExcelSheetColumnNumber_171 {
    public static int titleToNumber(String s){
        if (s == null)
            return -1;
        int num = 0;
        for (int i = 0; i < s.length(); i++){
            num *= 26;
            num += s.charAt(i) - 'A' + 1;
        }
        return num;
    }
    public static void main(String[] args){
        String s1 = "A";
        String s2 = "AB";
        String s3 = "ZY";
        System.out.println(titleToNumber(s1));
        System.out.println(titleToNumber(s2));
        System.out.println(titleToNumber(s3));

    }
}

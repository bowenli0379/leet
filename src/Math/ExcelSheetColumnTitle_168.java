package Math;

public class ExcelSheetColumnTitle_168 {
    public static String convertToTitle(int n){
        if (n < 0)
            return null;
        StringBuilder sb = new StringBuilder();
        while (n > 0){
            sb.insert(0,(char)('A'+(n-1)%26));
            n = (n - 1) / 26;
        }
        return sb.toString();
    }
    public static void main(String[] args){
        int n1 = 1;
        int n2 = 28;
        int n3 = 701;
        System.out.println(convertToTitle(n1));
        System.out.println(convertToTitle(n2));
        System.out.println(convertToTitle(n3));
    }
}

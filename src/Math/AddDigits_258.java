package Math;

public class AddDigits_258 {
    public static int addDigits(int num){
        int temp = 0;
        while(num > 0){
            temp += num % 10;
            num = num / 10;
        }
        if (temp < 10)
            return temp;
        else
            return addDigits(temp);
    }
    public static void main(String[] args){
        int num = 38;
        System.out.println(addDigits(num));
    }
}

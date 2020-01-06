package Math;

public class IntegerToRoman_12 {
    public static String intToRoman(int number){
        int[] values = {1000, 900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romans = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length; i++){
            while (number >= values[i]){
                number -= values[i];
                sb.append(romans[i]);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        int number1 = 3;
        int number2 = 4;
        int number3 = 9;
        int number4 = 58;
        int number5 = 1994;
        System.out.println(intToRoman(number1));
        System.out.println(intToRoman(number2));
        System.out.println(intToRoman(number3));
        System.out.println(intToRoman(number4));
        System.out.println(intToRoman(number5));

    }
}

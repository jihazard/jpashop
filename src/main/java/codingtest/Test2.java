package codingtest;

import java.util.Locale;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();

        String result = convertWord(input);
        System.out.println(result);
    }

    private static String convertWord(String input) {
        StringBuilder builder = new StringBuilder();
        for(char ch : input.toCharArray()) {
            if((65 <= ch) && ch <= 90) {
                builder.append(String.valueOf(ch).toLowerCase());
            }else {
                builder.append(String.valueOf(ch).toUpperCase());
            }
        }

        return builder.toString();
    }


}

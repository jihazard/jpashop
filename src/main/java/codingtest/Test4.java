package codingtest;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int count = in.nextInt();
        String[] array = new String[count];
        for(int i=0; i<=count; i++){
            array[i] = in.nextLine();
        }

        String[] reverseArray = revereWord(array);
        //System.out.println(reverseArray);
    }

    private static String[] revereWord(String[] array) {
        String[] reverseArray = new String[array.length];

        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
            String reverseWord = _reverse(array[i]);
            System.out.println(reverseWord);
            reverseArray[i] = reverseWord;
        }

        return reverseArray;
    }

    private static String _reverse(String word) {
        StringBuilder builder = new StringBuilder();
        char[] charArray = word.toCharArray();

        for (int i = word.length()-1; i >= 0  ; i--) {
            builder.append(String.valueOf(charArray[i]));
        }

        return builder.toString();
    }
}

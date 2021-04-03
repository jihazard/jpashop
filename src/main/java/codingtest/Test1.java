package codingtest;

import java.util.Locale;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String line = in.nextLine();
        String one = in.nextLine();

        int number =  calCount(line, one);
        System.out.println(number);
    }

    private static int calCount(String line, String one) {
        int result  = 0;
           for(char ch : line.toCharArray()){
               if(String.valueOf(ch).toLowerCase().equals(one.toLowerCase()) ) {
                   result ++;
               }
           }
        return result;
    }
}
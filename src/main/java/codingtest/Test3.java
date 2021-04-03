package codingtest;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();
        String word = checkWord(input);
        System.out.println(word);
    }

    private static String checkWord(String input) {
        String tempWord = "";
        int tempLength = 0;
        String[] wordList = input.split(" ");
        for (String word: wordList
             ) {
            if(tempLength < word.length()) {
                tempWord = word;
                tempLength = word.length();
            }
        }
        return tempWord;
    }
}

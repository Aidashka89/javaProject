package practice;

import java.util.Scanner;

public class LengthString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( " length of the longer string");
        String word1 = sc.next();
        System.out.println(" enter second word");
        String word2 = sc.next();

        if (word1.length()>  word2.length()){
            System.out.println(word1 + ": " + word2.length());
        }else{
            System.out.println(word1 + ": " + word2.length());
        }
    }
}

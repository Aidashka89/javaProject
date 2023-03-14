package problemSolving;

import java.util.Scanner;

public class Concatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        System.out.println("Enter a word");

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        System.out.println(word1.toUpperCase().charAt(word1.length()-2 )+ "" + word1.toLowerCase().charAt(word1.length()-1) + word2.toUpperCase().charAt(word2.length()-2) + "" + word2.toLowerCase().charAt(word2.length()-1) );

//======================================================================//



    }
}

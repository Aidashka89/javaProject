package problemSolving;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String str1 = sc.next();
        String reversedWord = "";
        for (int i = str1.length()-1;i>=0;i--){
            reversedWord += str1.charAt(i);
        }
        System.out.println("Reserved word: " + reversedWord);
    }
}

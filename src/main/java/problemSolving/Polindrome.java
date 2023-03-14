package problemSolving;

import java.util.Scanner;

public class Polindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = scanner.nextLine();
        String abc = "";


        for (int i = word.length() -1; i >=0 ; i -- ){
            abc += word.charAt(i);
        }if (word.equals(abc)){
            System.out.println("It's a palindrome");
        }else {
            System.out.println("It's not palindrome");
        }




    }
}

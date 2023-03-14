package practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PracticeFeb27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter any word");
        String word = sc.nextLine();

        if (word.contains("Java")){
            System.out.println(" YES, contains Java");

        }else {
            System.out.println("NO, doesn't contains");
        }
    }
}

package practice;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter without spaces");
        String sentence = scanner.nextLine();
        sentence = sentence.replace(" ","");
        System.out.println(sentence);
    }
}

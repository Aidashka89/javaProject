package stringAndStringManipulation;

public class StringToLowerCase {
    public static void main(String[] args) {
        String word = " Helo EveryONE!";
        System.out.println(word);

        word = word.toLowerCase();
        System.out.println(word);

        String word2 = "hello guys";
        System.out.println(word2);

        word2 = word2.toUpperCase();
        System.out.println(word2);

        String word3 = "hello everyone";
        String word4 = "HELLO EVERYONE";

        System.out.println(word3.toUpperCase().equals(word4));
        System.out.println(word3.equals(word4.toLowerCase()));



    }
}

package stringAndStringManipulation;

public class StringsReplace {
    public static void main(String[] args) {
        String word = "Apple banana strawberry";
        word = word.replace('a','e');
        System.out.println(word);

        System.out.println(word.replace('e','a'));

        String countries = "Italia Colombia Croatia";

        System.out.println(countries.replace(" ", " republic. "));
//=======================================================================================//

        String foods = "hot lentil soup, hot plov, cold kompot, cold ice-cream, warm pasta, warm pizza";
        System.out.println(foods.replace("hot", " tasty "));
         foods = foods.replace("hot", "cool");
        System.out.println(foods);

        foods = foods.replace("warm","italian");
        System.out.println(foods);


        String letters = "kdjbeuyfickdnsbdcmcd.c";
        letters = letters.replace("e","f");
        System.out.println(letters);


        String words = "hello everyone, hope you are doing good, i wish you good luck";
        word = word.replace("h","a");
        word = word.replace("e","a");
        word = word.replace("l","a");
        word = word.replace("o","a");
        word = word.replace("v","a");
        word = word.replace("r","a");
        word = word.replace("y","a");
        word = word.replace("n","a");
        word = word.replace("p","a");
        word = word.replace("u","a");
        word = word.replace("a","a");
        word = word.replace("d","a");
        word = word.replace("i","a");
        word = word.replace("g","a");
        word = word.replace("w","a");
        word = word.replace("s","a");
        word = word.replace("l","a");
        word = word.replace("c","a");
        word = word.replace("k","a");
        System.out.println(word);























    }
}

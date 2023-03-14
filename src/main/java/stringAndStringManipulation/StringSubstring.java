package stringAndStringManipulation;

public class StringSubstring {
    public static void main(String[] args) {

    String message = "Hello Chicago, why are you cold and windy?";
    String city = message.substring(6, 13);
        System.out.println(city);

        String question = message.substring(15);
        System.out.println(question);

        String welcomeSign = "Welcome to Usa, our population is 140 million people,"
+ "the average salary is 90k dollars, and our president is Joe Biden";
         String country = welcomeSign.substring(11,14);
        System.out.println(country);

        String population = welcomeSign.substring(welcomeSign.indexOf("140"),welcomeSign.indexOf(" people"));
        System.out.println( population);

        String salary = welcomeSign.substring(welcomeSign.indexOf("9"),welcomeSign.indexOf(", and"));
        System.out.println(salary);

        String president = welcomeSign.substring(welcomeSign.indexOf("Joe"));

        System.out.println(president);


         String phrase = "Just one positive thought in the morning can change your whole day.";
         String answer = phrase.substring(0,4) + " a " + phrase.substring(18,25);


        //========================================================//

        String str1 = "hi";
        String str2 = "bye";


        System.out.println(str1 + " " + str2 + " "+ str1.toUpperCase() + " " + str1.toUpperCase() + " " +  str2.toUpperCase() + " " + str2.toUpperCase() + " " + str2 + " " + str1);


        String see = "see";
        String hear = "hear";
        //print   sear//
        // substring
        //  replace
        // chart and substring

        System.out.println(see.substring(0,1)+ hear.substring(1,4));
        System.out.println(hear.replace('h','s'));
        System.out.println(see.charAt(0)+ hear.substring(1,4));










    }}

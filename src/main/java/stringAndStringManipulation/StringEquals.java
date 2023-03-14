package stringAndStringManipulation;

public class StringEquals {
    public static void main(String[] args) {
        String country1 = "USA";
        String country2 = "USA";
        String country3 = new String("USA");

        System.out.println(country1 == country2);
        System.out.println(country1 == country3);
        System.out.println(country2 == country3);
        System.out.println(country2==country2);
        System.out.println(country2 == country1);

        System.out.println(country1.equals(country2));
        System.out.println(country2.equals(country3));

        String apple1 = "red";
        String apple2 = "red";
        String apple3 = "Red";
        boolean a = apple1.equals(apple2);
        System.out.println(a);


    }
}

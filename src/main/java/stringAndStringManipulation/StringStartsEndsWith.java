package stringAndStringManipulation;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String banner = "ThanksGiving Sale 20%";


        boolean isSale = banner.startsWith("Thanks");
        System.out.println(isSale);

        System.out.println(banner.startsWith("thanks"));

        boolean endsWith = banner.endsWith("%");
        System.out.println(endsWith);


        String s = "Java"+1+2+"Quiz"+""+(3+4);
        System.out.println(s);
    }




}

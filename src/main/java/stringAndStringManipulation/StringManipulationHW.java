package stringAndStringManipulation;

public class StringManipulationHW {
    public static void main(String[] args) {
        String str1 = "Hello, Universe!";
        char ch = 'o';
        System.out.println(str1.indexOf(ch));
//===============================================//
        String str2 = "Hello, World!";
        int start = 7;
        int end = 12;
        String hi = str2.substring(start,end);
        System.out.println(hi);
        //===========================================//
        String str3 = "Good morning World";
        char ch1 = str3.charAt(13);
        System.out.println(ch1);
        //==========================================//
        String str4 = "        I love coding          ";
        str4 = str4.trim();
        System.out.println(str4);
        //===========================================//
        String str5 = "Learn as if you will forever, live like you will die tomorrow";
        str5 = str5.replace("o","");
        System.out.println(str5);



    }
}

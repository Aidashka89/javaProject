package stringAndStringManipulation;

public class PracticeStrings {
    public static void main(String[] args) {
        String singerName = "Michael Jackson";
        System.out.println(singerName.length());//returns number of chars

        System.out.println(singerName.endsWith("on"));// true
        System.out.println(singerName.startsWith("Misha"));// false

        System.out.println(singerName.isEmpty()); // false
        System.out.println(singerName.toLowerCase()); //michael jackson
        System.out.println(singerName);// Michael Jackson

        System.out.println(singerName.charAt(0));// M
        System.out.println(singerName.charAt(0) + singerName.charAt(3));// Mh
        // if you want print only letters put before " "//

        System.out.println(" " + singerName.charAt(0) + singerName.charAt(3));

        System.out.println(singerName.charAt(8));
        System.out.println(singerName.indexOf("c"));// 2
        System.out.println(singerName.indexOf("c",3 ));
        System.out.println(singerName.indexOf("W"));// -1
       // System.out.println(singerName.charAt(233456));// index out of bound error

        String singerName2 = "Justin Bieber";

        boolean areTheySame = singerName2.equals(singerName);
        System.out.println(areTheySame);
        System.out.println(singerName.equals(singerName2));
        singerName = singerName2;
        System.out.println(singerName.equals(singerName2));

        System.out.println(singerName==singerName2);// true






    }



}

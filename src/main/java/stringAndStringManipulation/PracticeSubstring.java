package stringAndStringManipulation;

public class PracticeSubstring {
    public static void main(String[] args) {
        String first_name = "Jacob";
        String last_name = "Coffee";

        String name1 = first_name.substring(0,1)+ last_name.substring(4,6);
        System.out.println( name1);

        String name2 = last_name.substring(0,1) + last_name.substring(4,6);
        System.out.println(name2);

        //name 3 = Jacee
        // name4 = Cob
        // name5 = Feeco
        //name6 = Ofja //
        // charAt, substring, replace, upperCase,lowerCase,indexOf//

         String name3  = first_name.substring(0,3)+ last_name.substring(4,6);
        System.out.println( name3);
         String name4 = last_name.substring(0,2) + first_name.substring(4);
        System.out.println(name4);
        String name5 = last_name;
        System.out.println(name5);











    }




}

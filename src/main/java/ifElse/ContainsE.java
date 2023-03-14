package ifElse;

import java.util.Scanner;

public class ContainsE {
    public static void main(String[] args) {
        String word = " Hello everyone!";
        int abc = word.indexOf('e');
        System.out.println(abc);
        if (abc == 2){
            System.out.println(2);
        }else {
            System.out.println(" not contains");
        }
        //=========================================================//
        String w = "potate";
        if(!w.contains("e")){
            System.out.println("The word does not contain the letter 'e'");

        }if(w.contains("e")){
            System.out.println(w.indexOf("e"));
    }
        //========================================================//
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a zip code");
        int zip = sc.nextInt();
        String zip1 = zip + "";
        if ((zip1 + "").length() == 5 && !zip1.contains("9") && !zip1.startsWith("0")){
            System.out.println("The zipcode is valid");
        }else {
            System.out.println("The zipcode invalid");
        }

















}
    }

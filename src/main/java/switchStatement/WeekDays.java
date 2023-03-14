package switchStatement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        int day = 34;
        switch (day){
            case 1, 2,3,4,5:
                System.out.println("Weekday");
                break;
            case 6,7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("invalid day");


        }

        char vowels = 'A';
        switch (vowels){
            case 'A','E','I','O','U':
                System.out.println("Vowel");
                break;
            case 'B','D','C':
                System.out.println("Other");
                break;

        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a grade");
        String grade = sc.next();
        switch (grade){
            case "A":
                System.out.println("Great!");
                break;
            case "B":
                System.out.println("Keep going!");
                break;
            case "C":
                System.out.println("Try to learn more");
                break;
            case "D":
                System.out.println("You can do it, more concentrate");
                break;
            case "F":
                System.out.println("Try next time");
                break;
            default:
                System.out.println("Not our student");


        }







    }
}

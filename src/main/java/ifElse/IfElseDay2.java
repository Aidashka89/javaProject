package ifElse;

import javax.sound.midi.Soundbank;

public class IfElseDay2 {
    public static void main(String[] args) {
        int day = 3;
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wensday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid Day");
        }
        //====================================================//
        byte time = 18;
        if (time >= 9 && time <= 17) {
            System.out.println("Work hours");

        } else if (time >= 7 && time <= 9 || time >= 18 && time <= 19) {
            System.out.println("Commute hours");
        } else if (time >= 6 && time <= 8) {
            System.out.println("Breakfast time");

        }
    }
    }
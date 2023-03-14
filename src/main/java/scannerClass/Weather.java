package scannerClass;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Enter temperature");
        double temp = user.nextDouble();
        System.out.println("Is it raining? true/false");
        boolean isRaining = user.nextBoolean();

        if (temp < 0) {
            System.out.println("Its freezing outside! Wear a heavy coat, gloves, and a hat.");
        } {
            
        }
    }
}

package problemSolving;

import java.util.Scanner;

public class HomeWorkFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive number");


        int number = scanner.nextInt();
        int factorial = 1;

        if (number>0){
            int r = 1;
            while (r <= number){
                factorial *= r;
                r++;
            }

            System.out.println("Factorial of " + number + ": is " + factorial);
        }else {
            System.out.println("Number must be positive. Please try again");
        }
//============================================================================//














    }
}

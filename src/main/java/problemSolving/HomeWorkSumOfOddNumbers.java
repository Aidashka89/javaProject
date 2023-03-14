package problemSolving;

import java.util.Scanner;

public class HomeWorkSumOfOddNumbers {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer");
         int a = scanner.nextInt();
//
        int number = a;
        int sum = 0;

        if (number > 0){
            int i = 1;
            while (i <= number){
                if (i % 2 != 0){
                    sum += i;
                }
                i++;
            }
            System.out.println("Sum of odd integers up to " + a + " is "+ sum);
        }else {
            System.out.println("Input must be positive. Please try again.");
        }

















    }
}

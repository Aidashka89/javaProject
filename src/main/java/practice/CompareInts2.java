package practice;

import java.util.Scanner;

public class CompareInts2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");

        int num2 = sc.nextInt();
        System.out.println("Enter third number");

        int num3 = sc.nextInt();
        System.out.println("Enter fourth number");
        int num4 = sc.nextInt();

        if (num1> num2 && num1> num3 ){
            System.out.println(num1 + "+" + num2 + "+" + num3);
        }
    }
}

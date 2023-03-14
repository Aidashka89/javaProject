package loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean yesNo = true;
        do {

            System.out.println("Enter a first number");
            int num1 = sc.nextInt();
            System.out.println("Enter an operator: + - / * %");
            String str = sc.next();
            System.out.println("Enter a second number");
            int num2 = sc.nextInt();
            if (str.equals("+")) {
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            }
            else if (str.equals("-")) {
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            }
            else if (str.equals("*")) {
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            }
            else if (str.equals("/")) {
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            }
            else if (str.equals("%")) {
                System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
            }
            else {
                System.out.println("Invalid operator");
            }
            System.out.println("Do you want to continue? true/false");
            yesNo = sc.nextBoolean();
        }while (yesNo);

        //=================================================//

        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int numOfNumbers=0;
        int number;
        while(true){
            System.out.println("Enter a positive number ( or negative to quit) :");
            number = scanner.nextInt();

            if (number==0) {
                continue;
            } else if (number < 0) {
                break;
            }
            sum+= number;
            numOfNumbers++;

        }
        System.out.println("The sum of all numbers: "+ sum);
            System.out.println("The average of all numbers: "+ sum/ numOfNumbers);



    }
}

package loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i<=10){
            System.out.println(i);
            i++;
        }

        int a = 1;
        while (a <=10){
            System.out.println("Good morning everyone");
            a++;
        }
        for (int s = 1;s <= 10;s++){
            System.out.println("Good morning everyone");
        }

        int u = 100;
        while (u >= 1){
            if ( u % 2 != 0){
                System.out.println(u);
            }
            u--;
        }
        int d = 1;
        while (d <= 31){
            System.out.println( d + "January");
            d++;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        boolean isPrime = true;
        int iterator = 2;
        while (iterator<number){
            if (number%iterator ==0){
                isPrime = false;
            }
            iterator++;
        }
        if (isPrime) {
            System.out.println("Prime");
        }else {
            System.out.println("Not prime");
        }
    }
}

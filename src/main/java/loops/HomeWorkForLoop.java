package loops;

import java.util.Scanner;

public class HomeWorkForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            //==============2=============//
        }
        for (int a = 2; a <= 20; a++) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }
        //3
        for (int w = 10; w >= 0; w--) {
            System.out.println(w);
        }
        //=============4

        for (int c = 1; c <= 10; c++) {
            System.out.println(c + " * " + 5 + " = " + (5 * c));
        }
        //5

        for (int d = 0; d <= 20; d++) {
            if (d % 2 != 0) {
                System.out.println(d);
            }
        }
        //6
        int sum = 0;
        for (int e = 0; e <= 100; e += 2) {
            sum = sum + e;
        }
        System.out.println("The result is " + sum);
        //7

       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int sc = scanner.nextInt();
        int w = (sc + "").length();
        int sum1 = 0;
        System.out.print("(");
        for (int d = 0; d < w; d++) {
            int newNumber = sc % 10;
            System.out.print(newNumber + " ");
            sum1 += newNumber;
            sc = sc / 10;
        }
        System.out.println(")");
        System.out.println("sum -> " + sum1);


        //8
        for (int k = 1; k <=5; k++){
            for (int l = 5; l >=k ;l-- ){
                System.out.print(" *");
            }
            System.out.println();
        }
         //9
        for ( int g = 1; g <=4 ; g++){
            for (int m = 0;m < g; m ++){
                System.out.print(g);
            }
            System.out.println();
        }
    }
}
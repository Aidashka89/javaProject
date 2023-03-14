package practice;

import java.util.Scanner;

public class CompareInts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter ur 1st integer");
        int num1 = sc.nextInt();
        System.out.println("Enter ur 2nd integer");
        int num2 = sc.nextInt();
        System.out.println("Enter ur 3rd integer");
        int num3 = sc.nextInt();

        if (num1> num2 && num1 > num3){
            System.out.println(" 1st int is larger");
    } else if (num2 > num1 && num2 > num3) {
            System.out.println(" 2nd int is larger");
        } else if (num3 > num2 && num3 >num1) {
            System.out.println("3rd int is larger");
        }else {
            System.out.println();
        }
    }}

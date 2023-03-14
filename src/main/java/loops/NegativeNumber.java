package loops;

import java.util.Scanner;

public class NegativeNumber {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int a = 0;
        do {
            System.out.println("Enter even number");
            a = sc.nextInt();
        }while (a % 2 != 0);
    }
}

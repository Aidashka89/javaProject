package loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int abc = sc.nextInt();

        boolean zxc = true;
        for (int wer = 2; wer < abc; wer++) {
            if (abc % wer == 0) {
                zxc = false;
                break;
            }

        }if (zxc) {
            System.out.println("Is prime");
        } else{
            System.out.println("Not prime");
        }

    }
}


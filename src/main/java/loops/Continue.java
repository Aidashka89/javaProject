package loops;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i<=10;i++){
            if (i == 5){
                continue;
            }
            System.out.println(i);
        }

        for (int a = 1; a <= 100;a++){
            if (a % 2 ==0){
                continue;
            }
            System.out.println(a);
        }

        for (int b = 1;b<=10;b++){
            if (b % 3 == 0){
                continue;
            }
            System.out.println(b);
        }

        Scanner sca = new Scanner(System.in);
        int negative = sca.nextInt();
        int positive = sca.nextInt();
        System.out.println("Enter one negative number");
        System.out.println("Enter one positive number");

        for (int i = negative;i<= positive; i++){
            if (i<0 && i %2 == 0){
                continue;
            } else if (i>0 && i % 2 !=0) {
                continue;
            }
            System.out.println(i);
        }



    }
}

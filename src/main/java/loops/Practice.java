package loops;

import java.util.Random;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(1,100);

        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter your number");
            num = scanner.nextInt();
            if (num< randomNumber ){
                System.out.println("Too low, try again");
            } else if (num> randomNumber) {
                System.out.println("Too high, try again");
            }else{
                System.out.println("Good job");
            }
        }while (num!=randomNumber);
    }
}

package loops;

import java.util.Scanner;

public class HomeworkCountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String abc = sc.nextLine();
        int counter = 0;
        int i = 0;
        do {
            if (Character.isDigit(abc.charAt(i))) {
                counter++;
            }
            i++;
        } while (i < abc.length());

        System.out.println("counter = " + counter);

    }

}

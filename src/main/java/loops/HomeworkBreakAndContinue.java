package loops;

import java.util.Scanner;

public class HomeworkBreakAndContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int abc = scanner.nextInt();
        if (abc < 0) {
            System.out.println("Input must be positive. Please try again!");
        } else if (abc < 3) {
            System.out.println("There are no integers less than " + abc + " that are divisible by 3 but not by 5");
        }

        for (int i = 1; i <= abc; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println(i);

            }
        }

    }
}

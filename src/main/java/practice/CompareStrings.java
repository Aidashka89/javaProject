package practice;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter compare");
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        if (a.equals(b)){
        System.out.println("EQUAL");
    }else{
            System.out.println("NOT EQUAL");
        }
    }

}

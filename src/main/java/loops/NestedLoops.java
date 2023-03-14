package loops;

import methods.PracticeMethods;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        for (int a = 1;a<=15;a ++){
            for (int b = 1;b<=15;b++){
                System.out.print( (a * b) + "\t ");
            }
            System.out.println();
        }
        //===============================================//
       for (int q = 1;q<=10;q++){
           for (int w =1;w<=q;w++){
               System.out.print("* " + "\t");
           }
           System.out.println();
    }//==========perfect tree================//
       int rows = 5;
       for (int i = 1;i<=rows;i++){
           for (int j = rows - i;j>=1;j--){
               System.out.print( " ");
           }
           for (int k = 1;k<=i;k++){
               System.out.print("* ");
           }
           System.out.println();
       }
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int sc = scanner.nextInt();
//        int w = (sc + "").length();
//        int sum = 0;
//        System.out.print("(");
//        for (int i = 0; i < w; i++){
//            int num = sc % 10;
//            System.out.print(num + " ");
//            sum += num ;
//            sc = sc / 10;
//        }
//        System.out.println(")");
//        System.out.println("sum: "+ sum);
}
}

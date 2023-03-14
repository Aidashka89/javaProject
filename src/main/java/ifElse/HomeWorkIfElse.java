package ifElse;

public class HomeWorkIfElse {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        int num3 = 5;
        if (num1 == num2){
            System.out.println( "Two of the numbers equal");
        } else if (num2 == num3) {
            System.out.println(" Two of the numbers equal");
        } else if (num1 == num3) {
            System.out.println("Two of the numbers equal");
        }else{
            System.out.println(" None of the numbers are equal");
        }
        //2======================================================//
        int num = 15;

        if (num % 3 == 0 || num % 5 == 0){
            System.out.println(" Multiple of 3 or 5");
        }else{
            System.out.println(" Not a multiple of 3 or 5");
        }
        //3====================================================//

         int abc = 5;
        int cba = 6;
        int sum = abc + cba;
        if (sum % 2 == 0){
            System.out.println(" Even ");
        }else {
            System.out.println(" Odd ");
        }
//====================================================//
        int in = 7;
        if (in % 1 == 0 && in % in == 0){
            System.out.println(" Prime ");
        }else {
            System.out.println(" Not prime ");
        }













    }
}

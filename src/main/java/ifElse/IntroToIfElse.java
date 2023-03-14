package ifElse;

public class IntroToIfElse {
    public static void main(String[] args) {
        int a = 18;
        int b = 5 ;
        System.out.println(" I will compare a and b below");

        if ( a< b){
            System.out.println("a is less than b" );

        }

        int number1 = 100;
        int number2 = 50;
         if (number1/number2 == 2){
             System.out.println("Yes, two!");

         }else{
             System.out.println("Not two!");


         }




         String elon = "Tesla SpaceX Paypal Twitter";
         if (elon.contains("Paypal")){
             System.out.println("Elon owned Paypal");

         }else{
             System.out.println("Elon did not owned Paypal");


         }


    }


}

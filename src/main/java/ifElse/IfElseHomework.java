package ifElse;

public class IfElseHomework {
    public static void main(String[] args) {
        int number = 40;
        if (number > 0){
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }
//2========================================================//
        int year = 2019;
        if (year % 4 == 0 && year % 100 != 0){
            System.out.println(" Leap year ");
        }else{
            System.out.println(" Not leap ");
        }
    //3=======================================================//
     int num1 = 3;
     int num2 = 123;
     if (num1<num2){
            System.out.println("Num2 larger than num1");
        } else{
         System.out.println("Num2 not larger than num1");
        }
//4===============================================================//

        double tempInFahrenheit = 77.3;
        if (tempInFahrenheit < 32){
            System.out.println(" Freezing! ");
        } else if (tempInFahrenheit < 212) {
            System.out.println(" Boiling!");
        }else {
            System.out.println(" warm temp.. ");
        }
//5===============================================================//
       byte month = 6;
        if (month >= 3 && month < 6){
            System.out.println(" Spring ");
        } else if (month >= 6 && month < 9 ) {
            System.out.println(" Summer ");
        } else if (month >= 9 && month < 12) {
            System.out.println(" Fall ");
        }else{
            System.out.println(" Winter ");
        }
    }
}
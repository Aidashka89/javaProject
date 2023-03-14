package ifElse;

public class IfElseHW2 {
    public static void main(String[] args) {
        // 1
        int number = 40;
        if(number > 0){
            System.out.println("Positive");
        } else if(number<0){
            System.out.println("negative");
        } else if (number==0){
            System.out.println("zero");
        }

        // 2
         int year = 2019;
        if(year % 4 == 0 && year%100 !=0){
            System.out.println("Year is leap");
        } else{
            System.out.println("not leap");
        }

        // 3

        int num1 = 3;
        int num2 = 123;

        if(num1 > num2){
            System.out.println("num1 is more than num2");
        } else {
            System.out.println("num2 is more than num1");
        }

        int a = 7;
        int b = 9;
        int c = 11;

        if (a > b){
            System.out.println(" a larger than b");
        } else if (b > c ) {
            System.out.println(" b larger than c");

        } else if (c < b ) {
            System.out.println(" c less than b");
        }else {
            System.out.println(" c larger than b");
        }
        // 4
        double temp = 77.3;
        if (temp > 32){
            System.out.println("its above than 32");
        } else if (temp < 212 ) {
            System.out.println(" above 212 ");
        } else{
            System.out.println("not below 32 and not above 212");
        }

    }
}

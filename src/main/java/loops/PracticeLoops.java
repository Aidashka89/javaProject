package loops;

public class PracticeLoops {
    public static void main(String[] args) {


        for (int y = 10; y >= 0; y -= 2) {
            System.out.println("The value y is: " + y);


            for (int num = 1; num <= 15; num += 2) {
                System.out.println("The value num is: " + num);
            }
            int i = 0;
            for (int sum = 1;sum <= 10;sum++){
                System.out.println("The value num is: "+ sum);
              i = i + sum;
            }
            System.out.println(" The result is " + i);


            int sum = 0;
            for (int e = 0; e <= 100;e+=2){
                System.out.println("The value is : " + e);
                sum = sum + e;
            }

            System.out.println("The result is: " + sum);

        }
    }
}

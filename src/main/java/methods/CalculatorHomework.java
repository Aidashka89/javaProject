package methods;

public class CalculatorHomework {
    public static int addititon(int x, int y){
        return x + y;
    }
    public static int subtraction(int x,int y){
        return x - y;
    }
    public static int multiplication(int x, int y){
        return x * y;
    }
    public static double division(int x, int y){
        if(y != 0){
            return(double) x/y;
        }
        else {
            return 0;
        }
    }
    public static int modulus(int x, int y){
        return x % y;
    }

    public static void main(String[] args) {
        System.out.println(addititon(7,9));
        System.out.println(subtraction(56,47));
        System.out.println(multiplication(456,8765));
        System.out.println(division(5,2));
        System.out.println(modulus(5,3));

    }
}

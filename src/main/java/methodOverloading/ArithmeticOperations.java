package methodOverloading;

public class ArithmeticOperations {
    public int SumOfNumbers(int a, int b) {
        return a + b;
    }

    public int SumOfNumbers(long a, long b, long c) {
        return (int) (a + b + c);
    }

    public int AverageOfNumbers(int a,int b, int c, int d){
        return (a + b + c + d) / 4;
    }

    public int AverageOfNumbers(long a,long b, long c, long d){
        return (int)(a + b + c + d) / 4;
    }











}
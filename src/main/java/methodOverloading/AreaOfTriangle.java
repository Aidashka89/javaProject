package methodOverloading;

public class AreaOfTriangle {
    public double getAreaOfTriangle(int base, int height){
        return getAreaOfTriangle((double)base, height);
    }

    public double getAreaOfTriangle(int a, int b, int c){
        return getAreaOfTriangle((double)a,b,c);
    }

    public double getAreaOfTriangle(double base, double height){
        return 0.5 * base * height;
    }

    public double getAreaOfTriangle(double a, double b, double c){
        double semiPerimeter = (a + b + c) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
    }

}

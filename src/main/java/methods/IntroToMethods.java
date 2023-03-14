package methods;

public class IntroToMethods {

    double getPerimeterOfTriangle(double a, double b,double c){
      return  a + b + c;
    }


    int getLengthOfString(String str){
        return str.length();
    }


    public static void main(String[] args) {

        IntroToMethods intro = new IntroToMethods();

        System.out.println(intro.getPerimeterOfTriangle(5.4,8.9,7.6));
        Rectangle abc = new Rectangle();
        abc.width = 5.6;
        abc.height = 9.8;
       abc.calculateArea();
       double s = abc.calculatePerimeter();
        System.out.println( s);
    }
















}

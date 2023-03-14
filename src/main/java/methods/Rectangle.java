package methods;

public class Rectangle {

    double width;
    double height;

    public void calculateArea(){
        double a = width * height;
        System.out.println("Area of rectangle is: "+ a );
    }

    public double calculatePerimeter(){
        double b = (width + height) * 2;
        return b;
    }

    public static void main(String[] args) {
        Rectangle abc = new Rectangle();
        abc.width = 5.6;
        abc.height = 9.8;
        abc.calculateArea();

        double s = (abc.width + abc.height) * 2;
        System.out.println("Perimeter of rectangle is: " + s);

    }












}

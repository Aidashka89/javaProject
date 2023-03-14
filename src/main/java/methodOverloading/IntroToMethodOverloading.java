package methodOverloading;

public class IntroToMethodOverloading {

    public int getAreaOfRectangle(int length, int width) {
        return length * width;
    }

    public int getAreaOfRectangle(double length, double width) {
        return (int) (length * width);
    }


    public int getPerimeterOfSquare(int length, int width) {
        return (length + width) * 2;
    }

    public int getPerimeterOfSquare(long length, long width) {
        return (int)(length + width) * 2 ;
    }
    public int getPerimeterOfSquare(double length, double width) {
        return (int)(length + width) * 2;
    }
    }
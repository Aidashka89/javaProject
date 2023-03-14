package objects;

public class Car {
    String model;
    String color;
    String year;
    int price;

    public void drive(){
        System.out.println(model + " is driving");
    }
    public void stop(){
        System.out.println(model + " can stop");
    }

    public void playMusic(){
        System.out.println(model + " is has great audio system");
    }
    public void color (){
        System.out.println(model + " is " + color);
    }
    public void year(){
        System.out.println(model + " is " + year);
    }
    public void price(){
        System.out.println(model + " price is " + price);
    }


    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Toyota";
        car1.year = "2023";
        car1.price = 130000;
        car1.color = "Red";

        Car car2 = new Car();
        car2.model = "Audi";
        car2.color = "White";
        car2.year = "2022";
        car2.price = 12000;

        car1.price();
        car2.price();
        car1.year();
        car2.year();
        car1.drive();
    }
}

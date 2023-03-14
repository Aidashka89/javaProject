package methods;

public class Mobile {
    String model;
    int price;
    int memory;

    public void ring (){
        System.out.println(model + " has ring");
    }
    public void turnOn(){
        System.out.println(model + " turns on");
    }
    public void turnOff(){
        System.out.println(model + " turns off");
    }


    public static void main(String[] args) {
        Mobile phone = new Mobile();
        phone.memory = 256;
        phone.price = 1000;
        phone.model = "IPhone";

        Mobile phone2 = new Mobile();
        phone2.model = "Samsung";
        phone2.price = 999;
        phone2.memory = 256;

        phone.ring();
        phone.turnOn();
        phone.turnOff();
        phone2.turnOn();
        int a = phone.price;
        String b = phone.model;
        String c = phone2.model;
        System.out.println("The price of " + b + " is " + a);
        System.out.println(c + " has  " + phone2.memory + " GB memory");
    }




}

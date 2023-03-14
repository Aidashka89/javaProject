package objects;

public class Zoo {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.type = "Tiger";
        animal1.isCarnivore = true;
        animal1.isMammal = true;
        animal1.habitat = "Jungle";
        animal1.age = 7;



        Animal animal2 = new Animal();
        animal2.age = 10;
        animal2.type = "Zebra";
        animal2.habitat = "Safari";
        animal2.isCarnivore = false;
        animal2.isMammal = true;

        animal1.isMammal();
    }
}

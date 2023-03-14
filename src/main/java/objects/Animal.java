package objects;

public class Animal {
    String type;
    boolean isMammal;
    boolean isCarnivore;
    int age;
    String habitat;

    public void type(){
        System.out.println(type + " is Tiger");
    }
    public void age(){
        System.out.println(type + " is " + age + " years old");
    }
    public void habitat(){
        System.out.println(type + " is " + habitat);
    }
    public void eat(){
        System.out.println(type + " is eat a lot");
    }
    public void sleep(){
        System.out.println(type + " is sleep at night");
    }
    public void play(){
        System.out.println(type + " is likes to play");
    }
    public void isMammal() {
        System.out.println(type + isMammal);
    }

    public void isCarnivore(){
        System.out.println(type + " is carnivore: " + isCarnivore);
    }


}


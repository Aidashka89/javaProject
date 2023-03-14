package objects;

public class School {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Leo";
        student1.phone = "123456789";
        student1.email = "leo@gmail.com";
        student1.age = 18;
        student1.major = "Law";


        Student student2 = new Student();
        student2.name = "Alex";
        student2.phone = "34567789";
        student2.email = "Alex@gmail.com";
        student2.age = 20;
        student2.major = "Accounting";

        student1.read();
    }
}

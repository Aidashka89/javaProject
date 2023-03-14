package stringAndStringManipulation;

public class HomeWorkPracticeEqualsAndEqualsEquals {
    public static void main(String[] args) {
        String hello1 = "Hello World!";
        String hello2 = "Hello World!";
        String hello3 = new String("Hello World!");

        boolean a = hello1 == hello2;
        System.out.println(a);
        boolean b = hello1 == hello3;
        System.out.println(b);
        boolean c = !hello1.equals(hello2);
        System.out.println(c);

        hello1 = hello1.toLowerCase();
        System.out.println(hello1);
        hello2 = hello2.toLowerCase();
        System.out.println(hello2);
        boolean wre = hello1.equals(hello2);
        System.out.println(wre);
        boolean qwe = hello1 == hello2;
        System.out.println(qwe);
        boolean asd = !hello1.equals(hello2);
        System.out.println(asd);
        boolean bgh = hello1.equalsIgnoreCase(hello2);
        System.out.println( bgh );

        hello1 = hello1.toUpperCase();
        System.out.println(hello1);
        hello3 = hello3.toUpperCase();
        System.out.println(hello3);

        boolean fgh = hello1.equals(hello3);
        System.out.println(fgh);
        boolean jkl = hello1 == hello3;
        System.out.println(jkl);
        boolean cvb = !hello1.equals(hello3);
        System.out.println(cvb);
        boolean klb = hello1.equalsIgnoreCase(hello3);
        System.out.println(klb);


    }
}

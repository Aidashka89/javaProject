package stringAndStringManipulation;

public class StringManipulationHomeWork2 {
    public static void main(String[] args) {
        //1
        String abc ="Hello world";
         int cba = abc.indexOf('w');
        System.out.println(cba);

        //2
        String asd = "Hello";
        char fgh = asd.charAt(0);
        System.out.println(fgh);

        //3
        String hjk = "HELLO";
        hjk = hjk.toLowerCase();
        System.out.println(hjk);

        //4
        String lkj = "hello";
        lkj = lkj.toUpperCase();
        System.out.println(lkj);

        //5
        System.out.println(hjk.equals(lkj));
        System.out.println(hjk==lkj);
        System.out.println(!hjk.equals(lkj));

        //6

        String name = new String("the quick brown fox");
        String name0 = name.substring(0, 1);
        System.out.println(name0);
        String name1 = name0.toUpperCase();
        System.out.println(name1);
        String name2 = name.substring(1,3);
        System.out.println(name1+ name2);

        String a0 = name.substring(4,5);
        System.out.println(a0);
        String a1 = a0.toUpperCase();
        String a2 = name.substring(6,10);
        System.out.println(a1 +a2);

        String b0 = name.substring(10,11);
        String b1 = b0.toUpperCase();
        String b2 = name.substring(11,16);
        System.out.println(b1 + b2);

        String c0 = name.substring(16,17);
        String c1 = c0.toUpperCase();
        String c2 = name.substring(17,19);
        System.out.println(c1 + c2);

        String answer = name1 + name2 + " " + a1 + a2 + " " + b1 + b2 + " " + c1 + c2;
        System.out.println(answer);

        //7=========================================//
        String lock = "Hello";
        System.out.println(lock.length());
        char clock = lock.charAt(4);
        System.out.println(clock);
        char clock1 = lock.charAt(3);
        System.out.println(clock1);
        char clock2 = lock.charAt(2);
        System.out.println(clock2);
        char clock3 = lock.charAt(1);
        System.out.println(clock3);
        char clock4 = lock.charAt(0);
        System.out.println(clock4);
        //8??????????==========================================//

        String vowels = "Hello World";
        vowels = vowels.toLowerCase();
        System.out.println(vowels);
        char count = vowels.charAt(1);
        System.out.println(count);
        char count1 = vowels.charAt(4);
        System.out.println(count1);
        char count2 = vowels.charAt(7);
        System.out.println(count2);



        //9=================================================//
        String concat1 = "Hello";
        String concat2 = "World";
        String answer1 = concat1.concat(concat2);
        System.out.println(answer1);
        //10============================================//

        String luck = "hello";
        String luck1 = "HELLO";
        boolean luck2 = luck.equalsIgnoreCase(luck1);
        System.out.println(luck2);

        //11==============================================//
        String duck = "Hello World";
        System.out.println(duck.length());
        //12======================================//

        String log = "Hello";
        char dog = log.charAt(3);
        System.out.println(dog);
        //13=======================================//

        String hit = "Hello World";
        int tax = hit.indexOf('l');
        System.out.println(tax);

        //14========================================//
        String vision = "hello";
        String vision1 = "hello";
        boolean vision2 = vision.equals(vision1);
        System.out.println(vision2);
        boolean vision3 = vision==vision1;
        System.out.println(vision3);
        //15========================================//
        String press = "hello";
        String press1 = "HELLO";
        boolean stress = !press.equals(press1);
        boolean stress1 = press != press1;
        System.out.println(stress);
        System.out.println(stress1);

        //16===================================//
        String nice = "HELLO WORLD";
        nice = nice.toLowerCase();
        System.out.println(nice);

        //17===============================//
        String mice = "hello world";
        mice = mice.toUpperCase();
        System.out.println(mice);
        //18==============================//
        String twice = "Hello World";
        twice = twice.replace("l","r");
        System.out.println(twice);
        //19===============================//
        String glaze = new String("the quick brown fox");
        String glaze1 =glaze.substring(0,1);
        System.out.println(glaze1);

        glaze1 = glaze1.toUpperCase();
        System.out.println(glaze1);

        String glaze2 = glaze.substring(1,3);
        System.out.println(glaze2);

        String glaze3 = glaze.substring(4,5);
        System.out.println(glaze3);

        glaze3 = glaze3.toUpperCase();
        System.out.println(glaze3);

        String glaze4 = glaze.substring(5,9);
        System.out.println(glaze4);

        String glaze5 = glaze.substring(10,11);
        System.out.println(glaze5);

        glaze5 = glaze5.toUpperCase();
        System.out.println(glaze5);

        String glaze6 = glaze.substring(11,15);
        System.out.println(glaze6);

        String glaze7 = glaze.substring(16,17);
        System.out.println(glaze7);
         glaze7 = glaze7.toUpperCase();
        System.out.println(glaze7);

        String glaze8 = glaze.substring(17);
        System.out.println(glaze8);

        String fin = glaze1 + glaze2 + " " + glaze3 + glaze4 + " " + glaze5 + glaze6 + " " + glaze7 + glaze8;
        System.out.println(fin);















    }
}

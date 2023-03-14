package stringAndStringManipulation;

public class IntroToStrings {
    public static void main(String[] args) {
        String city = "London";
        System.out.println(city);

        String city2 = new String("New York");
        //================================================//

        System.out.println(city.length());
        System.out.println(city2.length());
        String name = "Antananarivo";
        System.out.println("The Lenght of Antananario is: " + name.length());
        //=====================================//
        String school = "Codewise";
        school = "Codewise Academy";
        //==================================================//
        String fruit1 = "apple";
        String fruit2 = "apple";

        boolean isSame = fruit1.equals(fruit2);
        System.out.println(isSame);//true

        String fruit3 = "Apple";
        isSame = fruit1.equals(fruit3);
        System.out.println(isSame);//false

        fruit1 = "banana";
        fruit2 = "orange";
        System.out.println(fruit1.equals(fruit2));
        // (!)not equals, TRUE

        int cup1 = 5;
        int cup2 = 10;
        int cup3 = 0;

        cup3 = cup1;
        cup1 = cup2;
        cup2 = cup3;
        System.out.println(cup1);
        //============//

        int aa = 5;
        int bb = 10;

        int cc = aa;
        aa += aa;
        bb -= cc;
        System.out.println("aa" + aa);
        System.out.println("bb" + bb);

        String state1 = "California";
        String state2 = "Illinois";
        String state3 = "Florida";
        String state4 = "ILlinois";
        String state5 = "florida";

        boolean vv = !state1.equals(state2);
        System.out.println(vv);

        boolean bbr = state2.equalsIgnoreCase(state4);
        System.out.println(bbr);

        boolean bbb = state3.equals(state5);
        System.out.println(bbb);

        boolean uuu = !state5.equals(state1);
        System.out.println(uuu);

        boolean ppp = !state4.equals(state3);
        System.out.println(ppp);


        String flower = "Rose";
        String flower2 = "Azalia";
        String flower3 = "Pione";
        String flower4 = "Romashka";
        String flower5 = "Gvozdika";

        boolean qwe = !flower.equals(flower2);
        System.out.println(qwe);
        boolean rty = !flower3.equals(flower4);
        System.out.println(rty);
        boolean uio = !flower4.equals(flower5);
        System.out.println(uio);


        int cup7 = 5;
        int cup8 = 10;
        int cup9 = 0;


        cup9 = cup7;
        cup7 = cup8;
        cup8 = cup9;
        System.out.println(cup9);

        cup7 = cup8;
        cup9 = cup7;
        cup8 = cup9;
        System.out.println(cup7);
        System.out.println();









    }
}

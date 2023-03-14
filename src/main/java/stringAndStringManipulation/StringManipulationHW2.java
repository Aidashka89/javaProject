package stringAndStringManipulation;

public class StringManipulationHW2 {
    public static void main(String[] args) {
        String abc = "CodeWise is cool!";
        String answer = abc.substring(15,16);
        System.out.println(answer);
//2==============================================//
        String abc1 = "CodeWise is cool!";
        String answer1 = abc1.substring(0,1);
        System.out.println(answer1);
//3===============================================//
       String abc0 = abc1.substring(12,16);
        System.out.println(abc0);
        abc0 = abc0.replace('c','p');
        System.out.println(abc0);

//4===========================================================//
        String th = "Thanks CodeWise";
        th = th.substring(0,6);
        System.out.println(th);
//5============================================================//
        String th1 = new String("Thanks CodeWise");
        int th0 = th1.indexOf('e',11);
        System.out.println(th0);
//6==========================================================//
        String abc2 = abc.substring(0,1);
        System.out.println(abc2);
        boolean qwe = abc2.startsWith("C");
        System.out.println(qwe);

//7=========================================================//
        th1 = th1.replace('T','t');
        System.out.println(th1);
        th1 = th1.replace('t','T');
        System.out.println(th1);

//8===============================================================//
        int th2 = th1.indexOf('d');
        System.out.println(th2);
//9========================================================//
        String str = "     I am Happy!    ";
        str = str.trim();
        System.out.println(str);
//10====================================================//
        String str2 = "I can do it!";
        str2 = str2.toUpperCase();
        System.out.println(str2);









    }
}

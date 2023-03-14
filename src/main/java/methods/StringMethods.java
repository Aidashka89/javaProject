package methods;

public class StringMethods {
    static boolean compareStrings(String str1, String str2) {
        if (str1.equals(str2)) {
            return true;
        }
            return false;

        }

    public static void main(String[] args) {
        boolean isSame = compareStrings("Hello","hello");
        System.out.println(isSame);
        System.out.println(getSum(5));

    }

    static String concatinatedString(String abc1, String abc2){
        return (abc1 + abc2).toUpperCase();
    }

    static int twoStrings(String a1, String a2){
        return (a1 + a2).length();
    }



   public static boolean evenOrNot(int a){
        if (a % 2 == 0){
            return true;
        }return false;
    }

    public static boolean itDivisible( int s){
        return s % 10 == 0;

    }
    public static void MultTable(int a){
        for (int i = 1; i <= 10; i++){
            System.out.println(a + "*"+ "=" + (a * i));
        }
    }

    public static int getLargest (int v, int w){
        if (v > w){
            System.out.println(v);
            return v;
        }
        System.out.println(w);
        return w;
    }
     public static int getAverage (int a,int b,int c, int d){
        return (a + b + c + d)/4;


     }
     public static int getSum (int a){
        int b = 0;
        for (int i = 1;i <= a; i++){
            b = b + i;
        }
        return b;
     }


    }





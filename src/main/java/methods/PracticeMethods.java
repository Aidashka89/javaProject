package methods;

public class PracticeMethods {
    public static int multiplicationOfTwo(int a, int b) {
        return a * b;
    }


    public String convertToLowerCase(String word) {
        return word.toLowerCase();
    }

    public double divideByEachOther(int a,int b){
        return (double) a / b;
    }
    public static boolean isPalindrome(String word){
        String reverse ="";
        for (int i = word.length()-1;i >= 0;i --){
            reverse += word.charAt(i);
        }

        return word.equals(reverse);
    }


    public static void main(String[] args) {
        System.out.println(multiplicationOfTwo(4, 5));
        PracticeMethods practiceMethods2 = new PracticeMethods();
        System.out.println(practiceMethods2.convertToLowerCase("Hi Everyone"));
        System.out.println(practiceMethods2.divideByEachOther(10,3));
        System.out.println(isPalindrome("Aidana"));
    }
}
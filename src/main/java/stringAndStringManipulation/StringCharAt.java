package stringAndStringManipulation;

public class StringCharAt {
    public static void main(String[] args) {
        String welcomeSign = "Hello everyone! Welcome to Chicago";
        char c = welcomeSign.charAt(14);
        System.out.println(c);

        char cc = welcomeSign.charAt(2);
        System.out.println(cc);

        char bb = welcomeSign.charAt(0);
        System.out.println(bb);

        int length = welcomeSign.length();
        System.out.println(length);
System.out.println(welcomeSign.charAt(welcomeSign.length() -1 ));

//============================================================//
String name = "Damilia";
System.out.println(name.length());

String name2 = "Bolotbek Omorov";
System.out.println(name2.length());
System.out.println("The length of my brother name and surname is:" + name2.length());

int cucumber = 5;
int tomato = 10;
int orange = 0;
orange = cucumber;
cucumber = tomato;
tomato = orange;
System.out.println(tomato);
System.out.println(cucumber);









    }
}

package primitiveDataTypes;

public class PracticeVariableDeclaration {
public static void main (String [] args){
    /*  this is - multiline comment
    here we can write anything, it will not error
     its named comment
    1. Declare variable( create new variable)
     2. Assign value to variable ( put value inside variable)
     3. Reassign value to variable (put new to the same variable)

     */
 byte myByte;
 short myShort;
 int myInt;
 long myLong;

 /*
 NAMING CONVENTION:
 all variables must start with lower case
 all variables must use camelCase( thisIsMyCameCaseLongWord)
 all classes must start with upper case, use camelCase
 all packages must start with lower case, use camelCase
 names must start with any letter,or _ or $
  */
/*
byte myByte = 3; ( declare variable and assign value)
short age; ( declaring variable)
age = 40; ( assigning value to variable
-----------------------------------------------
Reassign VALUE

int number = 100
number = 30

 */
    byte myByte2;
    myByte2=30;
    System.out.println(myByte2);

    byte five;
    five=45;
    System.out.println(five);

    short old=67;
    old =6;
    System.out.println(old);

    int apple;
    int apple2;
    apple = 3425;
    apple2 = 100;
    System.out.println(apple);
    System.out.println(apple2);

    int code;

    long dream = 50;
    dream = 1234567;
            System.out.println(dream);

            long longNumber1 = -214783649L;
            long longNumber2 = 214783648L;
            longNumber1 = apple2;
            System.out.println(longNumber1);
            // casting means used to store larger variable values into smaller variable values
    int apple3 = (int)longNumber1;












    }



}

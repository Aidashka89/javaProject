package ifElse;

public class AndOperator {
    public static void main(String[] args) {
        if (2 < 3 && 5 < 10){
            System.out.println(" bye bye");

        }

        if (false && true){
            System.out.println("potato");
        }

        String username = "sunshine123";
        String password = "moonlight456!true";
        String actualEmail = "sunshine123@gmail.com";

        String enteredUsername = "sunshine123";
        String enteredPassword = "moonlight456!true";
        String enteredEmail = "sunshine123@gmail.com";

        if (username.equals(enteredUsername)) {
            System.out.println(username);
        }
        if (password.equals(enteredPassword)){
            System.out.println(password);
        }
         if (username.equals("sunshine123") && password != enteredPassword){
             System.out.println(username);
         }












    }}


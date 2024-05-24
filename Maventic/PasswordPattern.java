import java.util.regex.*;
public class PasswordPattern {
    public static boolean isValidPassword(String password){
        // checking length not less then 8 and Not more then 10
        if(password.length() > 10 || password.length()<8){
            return false;
        }
        //only digit or alphabatic character not allow special character
        if(!Pattern.matches("[a-zA-Z0-9]+", password)){
            return false;
        }
        //Check for at least one Uppercase and One digit character
        if(!Pattern.compile("[A-Z0-9]").matcher(password).find()){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        String password1 = "Password12";
        String password2 = "Pass@word";
        String password3 = "password";

        System.out.println(isValidPassword(password1));
        System.out.println(isValidPassword(password2));
        System.out.println(isValidPassword(password3));
    }   
}

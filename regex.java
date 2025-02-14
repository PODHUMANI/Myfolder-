

import java.util.regex.*;

public class EmailValidation {
    public static void main(String[] args) {
        String email = "example@gmail.com"; 
        boolean isValid = Pattern.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}", email);
        
        if (isValid) {
            System.out.println("Valid Email Address");
        } else {
            System.out.println("Invalid Email Address");
        }
    }
}

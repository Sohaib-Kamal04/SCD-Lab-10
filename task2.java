package lab10;

public class PasswordValidator {
    public static boolean isValid(String password) {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[0-9].*") &&
               password.matches(".*[!@#$].*") &&
               !password.contains(" ");
    }

    public static void main(String[] args) {
        String[] testPasswords = {
            "Pass@123",     
            "pass@123",     
            "Password",     
            "Pass 123!",    
            "Pa@1"       
        };

        for (String x : testPasswords) {
            System.out.println("Password: " + x + " => " + (isValid(x) ? "Valid" : "Invalid"));
        }
    }
}


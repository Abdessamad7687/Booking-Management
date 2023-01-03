package GUI;


public class Validations {
    
    public static boolean isEmail(String email) {
        return email.matches("^[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+$");
    }
    public static boolean isPhone(String phone) {
        return phone.matches("^(0|\\+212)[5-7][0-9]{8}$");
    }
    
    public static boolean isPassword(String password) {
        return password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
    }

    public static boolean isString(String str) {
        return str.matches("^[a-zA-Z]{3,}$");
    }
}

package chapter8;

import java.util.Scanner;

public class PasswordValidator {
    public static void  main(String args[]){
    System.out.println("Enter the password:");
    Scanner scanner = new Scanner(System.in);
    String password = scanner.next();

    System.out.println("Enter the username:");
    String username = scanner.next();

    System.out.println("Enter the old password:");
    String oldPassword = scanner.next();

    scanner.close();

    if(validatePasswordLength(password)==true &&validateUpperCaseLetter(password)==true && validateSpecialCharacter(password)==true
            && notContainUsername(password,username)==true && notSameAsOldPassword(password,oldPassword) ==true) {
        System.out.println("Password is Valid");
    }
    else
        System.out.println("Password is Invalid");

    }

   // validatePassword(password);

    /**
     * Validates the password by assuring it meets following rules
     * at least 8 characters long
     * contain an uppercase letter
     * contain a special character
     * not contain the username
     * not the same  as the old password
     * @param password password to be validated
     */
    public static boolean validatePasswordLength(String password){

        if(password.length()>=8)
            return true;
        else
            return false;
        }
    public static boolean validateUpperCaseLetter(String password) {
        boolean b = true;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i)))
                b = true;
            else
                b = false;
        }
        return b;
    }

    public static boolean validateSpecialCharacter(String password) {
        boolean b= true;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) == '!' || password.charAt(i) == '@' || password.charAt(i) == '#' || password.charAt(i) == '$' ||
                    password.charAt(i) == '%' || password.charAt(i) == '^' || password.charAt(i) == '&' || password.charAt(i) == '*')
                b =true;
            else
                b = false;
        }
        return b;
    }

    public static boolean notContainUsername(String password, String username){
        if(password.contains(username))
            return false;
        else
            return true;
    }
    public static boolean notSameAsOldPassword(String password, String oldPassword){
        if(password.equalsIgnoreCase(oldPassword))
            return false;
        else
            return true;
    }

}

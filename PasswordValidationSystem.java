//Comilang, Tayshaun M.
//CITCS 1N-A

package com.mycompany.passwordvalidationsystem;
import java.util.Scanner;
public class PasswordValidationSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        
        //Loop until a valid password is entered
        while (true) {
            System.out.println("Enter your password: ");
            password = scanner.nextLine();
            
            //Check if the password if valid
            if (isValidPassword(password)) {
                System.out.println("Your password is valid!");
                break; //exit
                
            } else {
                System.out.println("Password must contain atleast 8 characters, including one uppercase letter and one number");
                
            }
        }
        
        //close the scanner
        scanner.close();
        
    }
    
    //Method to validate the password
    public static boolean isValidPassword(String Password) {
        if (Password.length() < 8) {
            return false;    
        }
        
    //Check if the pass contains atleast one uppercase letter   
    boolean hasUpperCase = false;
    boolean hasNumber = false;
    
    for (char c : Password.toCharArray()) {
        if (Character.isUpperCase(c)) {
            hasUpperCase = true;  
        } 
        if (Character.isDigit(c)) {
            hasNumber = true;
        }
    }
    
    //Return true only if all conditions are met
    return hasUpperCase && hasNumber;
    
    
    }
}

package classes.class12;

import java.util.Scanner;

public class TaskInClass {
    public static void main(String[] args) {

        /*
        Store username, password and confirm password from a user and check following requirements:
        Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
        Password should be minimum 8 characters, if less → message=”Password is too short”.
        Password cannot contain username if so, → message=”Password cannot contain username”.
        Password should match confirmed password, if not  → message=“Passwords do not match”.
        Only after all requirements met → message “Your username and password has been created”
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter your username");
        String username=scan.next();
        System.out.println("Please enter your password");
        String password=scan.next();

        int len=password.length();
        String passwordConfirm=password;

        if (username.isBlank() || password.isBlank()){
            System.out.println("Username and Password cannot be empty");
        } else if(len<8){
            System.out.println("Password is too short");
        } else if (password.equals(username)){
            System.out.println("Password cannot contain username");
        } else if(!passwordConfirm.equals(password)){
            System.out.println("Passwords do not match");
        } else {
            System.out.println("Your username and password has been created");
        }


    }
}

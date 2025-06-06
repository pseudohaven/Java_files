// Java program for a simple login page
/*
NAME  : Erick Kabiru
ADM NO: BSE-05-0162/2024
GROUP : Group 3
 */
import java.util.Scanner;
public class Main{
    private static final String CORRECT_USERNAME = "haven";
    private static final String CORRECT_PASSWORD = "4321";
    private static final int MAX_ATTEMPTS = 3;
    public static void main(String[]args){
        Scanner haven = new Scanner(System.in);
        int attempts = 0;
        boolean loggedIn = false;
        while(attempts<MAX_ATTEMPTS && !loggedIn){
            System.out.println("Attempt"+(attempts + 1)+"of"+MAX_ATTEMPTS);
            System.out.println("Enter username : ");
            String username = haven.nextLine();
            System.out.println("Enter password : ");
            String password = haven.nextLine();
            if(username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)){
                System.out.println("Log in successfull.");
            }else{
                System.out.println("Incorrect username or password! try again.");
                attempts++;
            }
if(!loggedIn){
    System.out.println("Maximum login attempts reached.");
}
        }
    }
}

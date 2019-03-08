/*
Name:  Ryan Hill
Assignment:  Assignment 
Program: Computer Programmer
Date: 

Description:

*/
package midtermexam_versiona_extensioncode;
import java.util.Scanner;

/**
 *
 * @author Ryan Hill
 */
public class TestUserprofile {
    public static void main(String[] args){
        
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your name");
    String inName = s.nextLine();
    System.out.println("Choose your favourite genre");
    System.out.println("Comedy, Drama, Action, Mystery");
    String inGenre = s.nextLine();
    
    UserProfile user = new UserProfile(inName, inGenre);
    System.out.println("Your userProfile was created");
    
    }

}

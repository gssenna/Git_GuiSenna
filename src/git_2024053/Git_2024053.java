/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package git_2024053;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Git_2024053 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Name: Guilherme dos Santos Senna 
        //Sudent Number: 2024053
        
        //Creating a "Sign up" page for a digital platform.
        //It asks the user to type the name in order to create an username.
        
        Scanner scanner = new Scanner(System.in); // creating a scanner in order to input something
        
        String name; // variable to store name
       
        System.out.println("please, insert your name for creating a username. (PS: no numbers or special characteres allowed!)"); // output the question
        
        name = scanner.nextLine(); // creates the first input
        
        while (!name.matches("^[a-zA-Z]+$")) { // loop  created if the user does not type name only
            
            System.out.println("Error, your name must not include numbers or special characteres!"); // error output
            
            name = scanner.nextLine(); // create a user input in case the user does not time a properly name
        }

        // Modifying the string "name":
        
        name = name.toUpperCase(); // Converts the name to uppercase 
        
        name = "@" + name;   // add a "@" in front of the name

        // outpuut the name with all the modifications:
        System.out.println("Your username is: " + name);
    }
    
}

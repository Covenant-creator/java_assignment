/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package userinputarray;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class UserInputArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);

        // Use a loop to get input from the user
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a value for index " + i + ": ");
            numbers[i] = scanner.nextInt(); // Accept input
        }

        // Print the elements using a for-each loop
        System.out.println("\nThe values entered are:");
        for (int num : numbers) {
            System.out.println(num);
        }

        scanner.close();
    }
}

        // TODO code application logic here
    
    


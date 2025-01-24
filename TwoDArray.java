/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package twodarray;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class TwoDArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int[][] array = new int[10][10];
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter values for a 10x10 2D array:");
        for (int i = 0; i < 10; i++) { 
            for (int j = 0; j < 10; j++) { 
                System.out.print("Enter value for position [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        
        System.out.println("\nThe values entered in the 10x10 2D array are:");
        for (int[] row : array) { 
            for (int value : row) {
                System.out.print(value + " "); 
            }
            System.out.println(); // Move to the next row
        }

        scanner.close();
    }
}



        // TODO code application logic here
      


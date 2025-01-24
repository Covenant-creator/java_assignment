/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package americansingleloop;

/**
 *
 * @author USER
 */
public class AmericanSingleLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rows = 6;
        int columns = 14;
        
        for(int i =0; i < rows *columns; i++){
            int row = i/columns;
            int col = i%columns;
            
            if (row < 3){
                if(col< 7){
                    System.out.print("* ");
                    
                }else{
                    System.out.print("= ");
                }
            }else {
                System.out.print("= ");
            }   
            
            if(col == columns - 1){
                System.out.println();
            }
                    
            
                    
        }
            
        // TODO code application logic here
    }
    
}

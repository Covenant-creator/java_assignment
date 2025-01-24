/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nested.loop;

/**
 *
 * @author USER
 */
public class NigerianNestedLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int rows=4;
      int cols=11;
      
      for(int i=0;i<rows;i++){
          for(int j=0;j<cols;j++){
              if(j<3||j>7){
                  System.out.print("*");
              }else{
                  System.out.print("=");
              }
              
      }
          System.out.println();
         }
    }
}
